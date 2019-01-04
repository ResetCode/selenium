

import java.util.Map;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

public class TableAll {
	public static void main(String[] args) throws Exception {
		String savedPath = "e:\\Users\\Admin\\Desktop\\新建文件夹\\";

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl(
				"jdbc:mysql://172.22.30.110:3306/choujiang?useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useInformationSchema=true&autoReconnect=true&failOverReadOnly=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root123");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String tableSchema = "choujiang";

		String tableNames = "au_data,us_data,us_data_state";
		String[] splits = tableNames.split(",");
		for (String tableName : splits) {
			tableName = tableName.trim();
			String packageName = "com.selenum.po";

			List<Map<String, Object>> results = jdbcTemplate.queryForList(
					"select column_name, data_type, column_comment from information_schema.columns where table_schema=? and table_name=?",
					tableSchema, tableName);

			String beanName = convert(tableName, true);
			System.err.println("===========================================================");

			List<String> javaContent = new ArrayList<>();
			javaContent.add("package " + packageName + ".entity.table;\n");
			javaContent.add("public class " + beanName + " {");
			for (Map<String, Object> result : results) {
				String propName = convert(result.get("column_name").toString().toLowerCase(), false);

				String javaType = dataType(result.get("data_type").toString().toLowerCase());
				String methodName = convert(result.get("column_name").toString().toLowerCase(), true);
				javaContent.add("\t/** " + result.get("column_comment") + " */");
				javaContent.add("\tprotected " + javaType + " " + propName + ";");
				result.put("javaType", javaType);
				result.put("propName", propName);
				result.put("methodName", methodName);
			}
			javaContent.add("\n\tpublic " + beanName + "() {\n");
			javaContent.add("\t}\n");
			for (Map<String, Object> result : results) {
				String javaType = result.get("javaType").toString();
				String propName = result.get("propName").toString();
				String methodName = result.get("methodName").toString();
				javaContent.add("\t/**");
				javaContent.add("\t * 获取" + result.get("column_comment"));
				javaContent.add("\t * ");
				javaContent.add("\t * @return " + result.get("column_comment"));
				javaContent.add("\t */");
				javaContent.add("\tpublic " + javaType + " get" + methodName + "() {");
				javaContent.add("\t\treturn " + propName + ";");
				javaContent.add("\t}\n");
				javaContent.add("\t/**");
				javaContent.add("\t * 设置" + result.get("column_comment"));
				javaContent.add("\t * ");
				javaContent.add("\t * @param " + propName);
				javaContent.add("\t *            " + result.get("column_comment"));
				javaContent.add("\t */");
				javaContent.add("\tpublic void set" + methodName + "(" + javaType + " " + propName + ") {");
				javaContent.add("\t\tthis." + propName + " = " + propName + ";");
				javaContent.add("\t}\n");
			}
			javaContent.add("}");
			File saveDir = new File(savedPath + File.separatorChar + "entity" + File.separatorChar + "table");
			if (!saveDir.exists()) {
				saveDir.mkdirs();
			}
			File javaFile = new File(saveDir.getPath() + File.separatorChar + beanName + ".java");
			if (!javaFile.exists()) {
				javaFile.createNewFile();
			}
			FileUtils.writeLines(javaFile, javaContent, "\n");

			javaContent.clear();
			javaContent.add("package " + packageName + ".entity.extra;\n");
			javaContent.add("import " + packageName + ".entity.table." + beanName + ";\n");
			javaContent.add("public class Extra" + beanName + " extends " + beanName + " {");
			javaContent.add("}");
			saveDir = new File(savedPath + File.separatorChar + "entity" + File.separatorChar + "extra");
			if (!saveDir.exists()) {
				saveDir.mkdirs();
			}
			javaFile = new File(saveDir.getPath() + File.separatorChar + "Extra" + beanName + ".java");
			if (!javaFile.exists()) {
				javaFile.createNewFile();
			}
			FileUtils.writeLines(javaFile, javaContent, "\n");

			javaContent.clear();
			javaContent.add("package " + packageName + ".dao;\n");
			javaContent.add("import org.springframework.stereotype.Repository;\n");
			javaContent.add("@Repository");
			javaContent.add("public interface " + beanName + "Dao {");
			javaContent.add("}");

			saveDir = new File(savedPath + File.separatorChar + "dao");
			if (!saveDir.exists()) {
				saveDir.mkdirs();
			}
			javaFile = new File(saveDir.getPath() + File.separatorChar + beanName + "Dao.java");
			if (!javaFile.exists()) {
				javaFile.createNewFile();
			}
			FileUtils.writeLines(javaFile, javaContent, "\n");

			javaContent.clear();
			javaContent.add("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			javaContent.add("<!DOCTYPE mapper");
			javaContent.add("\tPUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\"");
			javaContent.add("\t\"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">");
			javaContent.add("<mapper namespace=\"" + packageName + ".dao." + beanName + "Dao\">");
			javaContent.add("</mapper>");

			saveDir = new File(savedPath + File.separatorChar + "mapper");
			if (!saveDir.exists()) {
				saveDir.mkdirs();
			}
			javaFile = new File(saveDir.getPath() + File.separatorChar + beanName + "DaoMapper.xml");
			if (!javaFile.exists()) {
				javaFile.createNewFile();
			}
			FileUtils.writeLines(javaFile, javaContent, "\n");

			javaContent.clear();
			javaContent.add("package " + packageName + ".service;\n");
			javaContent.add("import org.springframework.stereotype.Service;");
			javaContent.add("import org.springframework.beans.factory.annotation.Autowired;\n");
			javaContent.add("import " + packageName + ".dao." + beanName + "Dao;\n");
			javaContent.add("@Service");
			javaContent.add("public class " + beanName + "Service {");
			javaContent.add("\t@Autowired");
			javaContent.add("\tprivate " + beanName + "Dao " + beanName.substring(0, 1).toLowerCase()
					+ beanName.substring(1) + "Dao;\n");
			javaContent.add("}");

			saveDir = new File(savedPath + File.separatorChar + "service");
			if (!saveDir.exists()) {
				saveDir.mkdirs();
			}
			javaFile = new File(saveDir.getPath() + File.separatorChar + beanName + "Service.java");
			if (!javaFile.exists()) {
				javaFile.createNewFile();
			}
			FileUtils.writeLines(javaFile, javaContent, "\n");

			javaContent.clear();
			javaContent.add("package " + packageName + ".controller;\n");
			javaContent.add("import org.springframework.web.bind.annotation.RestController;");
			javaContent.add("import org.springframework.web.bind.annotation.RequestMapping;");
			javaContent.add("import org.springframework.http.MediaType;");
			javaContent.add("import org.springframework.web.bind.annotation.PostMapping;");
			javaContent.add("import org.springframework.web.bind.annotation.RequestParam;");
			javaContent.add("import org.springframework.beans.factory.annotation.Autowired;\n");
			javaContent.add("import " + packageName + ".service." + beanName + "Service;\n");
			javaContent.add("@RestController");
			javaContent.add("@RequestMapping(value = \"\", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)");
			javaContent.add("public class " + beanName + "Controller {");
			javaContent.add("\t@Autowired");
			javaContent.add("\tprivate " + beanName + "Service " + beanName.substring(0, 1).toLowerCase()
					+ beanName.substring(1) + "Service;\n");
			javaContent.add("}");

			saveDir = new File(savedPath + File.separatorChar + "controller");
			if (!saveDir.exists()) {
				saveDir.mkdirs();
			}
			javaFile = new File(saveDir.getPath() + File.separatorChar + beanName + "Controller.java");
			if (!javaFile.exists()) {
				javaFile.createNewFile();
			}
			FileUtils.writeLines(javaFile, javaContent, "\n");
		}

		System.exit(0);
	}

	public static String convert(String name, boolean first) {
		String[] splitNames = name.split("_");
		StringBuilder convert = new StringBuilder();
		for (String splitName : splitNames) {
			String firstChar = String.valueOf(splitName.charAt(0)).toUpperCase();
			convert.append(firstChar);
			convert.append(splitName.substring(1, splitName.length()));
		}

		if (!first) {
			String firstChar = String.valueOf(convert.charAt(0)).toLowerCase();
			convert.replace(0, 1, firstChar);
		}

		return convert.toString();
	}

	public static String dataType(String type) {
		switch (type) {
		case "char":
			return "String";
		case "varchar":
			return "String";
		case "int":
			return "Integer";
		case "tinyint":
			return "Integer";
		case "bigint":
			return "Long";
		case "double":
			return "Double";
		case "datetime":
			return "Date";
		case "date":
			return "Date";
		case "time":
			return "Date";
		default:
			return "String";
		}
	}
}
