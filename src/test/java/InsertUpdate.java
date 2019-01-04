

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class InsertUpdate {
	public static void main(String[] args) throws Exception {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl(
				"jdbc:mysql://172.22.30.110:3306/choujiang?useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&useInformationSchema=true&autoReconnect=true&failOverReadOnly=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root123");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String tableSchema = "choujiang";
		String tableName = "au_data";

		List<Map<String, Object>> results = jdbcTemplate.queryForList(
				"select column_name, data_type, column_comment from information_schema.columns where table_schema=? and table_name=?",
				tableSchema, tableName);

		List<String> columns = new ArrayList<>();
		List<String> properties = new ArrayList<>();
		for (Map<String, Object> result : results) {
			String column = "`" + result.get("column_name").toString().toLowerCase() + "`";
			String property = "#{" + convert(result.get("column_name").toString().toLowerCase(), false) + "}";
			columns.add(column);
			properties.add(property);
		}
		System.err.println("===========================================================");
		System.err.print("INSERT INTO `" + tableName + "` (");
		System.err.print(StringUtils.join(columns, ", "));
		System.err.print(") VALUES (");
		System.err.print(StringUtils.join(properties, ", "));
		System.err.println(")");
		System.err.println("===========================================================");
		System.err.print("UPDATE `" + tableName + "` SET ");
		for (Map<String, Object> result : results) {
			System.err.println("`" + result.get("column_name").toString().toLowerCase() + "`" + " = " + "#{"
					+ convert(result.get("column_name").toString().toLowerCase(), false) + "},");
		}
		System.err.println("WHERE `id` = #{id}");
		System.err.println("===========================================================");
		System.err.println("===========================================================");
		System.err.println("UPDATE `" + tableName + "`\n<set>");
		for (Map<String, Object> result : results) {
			System.err.println("\t<if test=\""+convert(result.get("column_name").toString().toLowerCase(), false)+" != null\">");
			System.err.println("\t\t`" + result.get("column_name").toString().toLowerCase() + "`" + " = " + "#{"
					+ convert(result.get("column_name").toString().toLowerCase(), false) + "},");
			System.err.println("\t</if>");
		}
		System.err.println("</set>");
		System.err.println("<where>\n\t`id` = #{id}\n</where>");
		System.err.println("===========================================================");
		System.err.print("INSERT INTO `" + tableName + "` (");
		System.err.print(StringUtils.join(columns, ", "));
		System.err.print(") VALUES (");
		for (int i = 0; i < columns.size(); i++) {
			System.err.print("?, ");
		}
		System.err.println(")");
		for (Map<String, Object> result : results) {
			System.err.print("info.get"+convert(result.get("column_name").toString().toLowerCase(), true)+"(), ");
		}
		System.err.println();
		System.err.println("===========================================================");
		System.err.print("UPDATE `" + tableName + "` SET ");
		for (Map<String, Object> result : results) {
			System.err.print("`" + result.get("column_name").toString().toLowerCase() + "`" + " = ?, ");
		}
		System.err.println("WHERE `id` = ?");
		System.err.println("===========================================================");

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
		case "decimal":
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
