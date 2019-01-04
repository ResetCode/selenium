
window.T={
	action:function() {
		var uls = document.getElementsByTagName('ul');
		console.log(uls);
		for(var i = 0; i < uls.length; i++) {
			
		
			var ul = uls[i];
			var lis = ul.childNodes;
			
			for(var j = 0; j < lis.length; j ++) {
				lis[j].className = 'van-ellipsis van-picker-column__item';
			}
			for(var z = 0; z < lis.length; z ++) {
				if(lis[z].innerHTML == $s1 && i == 0) {
					lis[z].className = 'van-ellipsis van-picker-column__item van-picker-column__item--selected';
					lis[z].click()
					console.log(1);
				}
				if(lis[z].innerHTML == $s2 && i == 1) {
					lis[z].className = 'van-ellipsis van-picker-column__item van-picker-column__item--selected';
					lis[z].click()
					console.log(2);
				}
				if(lis[z].innerHTML == $s3 && i == 2) {
					console.log(3);
					lis[z].click()
					lis[z].className = 'van-ellipsis van-picker-column__item van-picker-column__item--selected';
				}
			}
		}
		return;
	}
}


 	


