
function b(){
		var i=document.getElementById("text").value;
		var money=document.getElementById("qlt").innerText;
		i++;
		document.getElementById("text").value=i;
		document.getElementById("qlt_unit").innerText=money*i;
		tot_plc();
	}
function a(){
		var i=document.getElementById("text").value;
		var money=document.getElementById("qlt").innerText;
		if(i>0){
			i--;
			document.getElementById("text").value=i;
			document.getElementById("qlt_unit").innerText=money*i;
		}
		else{
			i=0;
			document.getElementById("text").value=i;
			document.getElementById("qlt_unit").innerText=money*i;
		}
		tot_plc();
	}
	function b1(){
		var i=document.getElementById("text_1").value;
		var money=document.getElementById("qlt_1").innerText;
			i++;
			document.getElementById("text_1").value=i;
			document.getElementById("qlt_unit_1").innerText=money*i;
			tot_plc();
		}
	function a1(){
					var money=document.getElementById("qlt_1").innerText;
			var i=document.getElementById("text_1").value;
			if(i>0){
				i--;
				document.getElementById("text_1").value=i;
				document.getElementById("qlt_unit_1").innerText=money*i;
			}
			else{
				i=0;
				document.getElementById("text_1").value=i;
				document.getElementById("qlt_unit_1").innerText=money*i;
			}
			tot_plc();
		}
checkall.onclick = function qx() {
	var a = document.getElementById("checkall");
	var input = document.getElementsByTagName("input");
	var b = input.length;
		for (var i = 0; i < b; i++) {
			input[i].checked = this.checked;
		}
		tot_plc();
}
box1.onclick=function(){
	tot_plc();
	if(document.getElementById("box1").checked!=true||document.getElementById("box2").checked!=true)
	checkall.checked=false;
	else if(document.getElementById("box1").checked==true&&document.getElementById("box2").checked==true)
	checkall.checked=true;
}
box2.onclick=function(){
	tot_plc();
	if(document.getElementById("box1").checked!=true||document.getElementById("box2").checked!=true)
	checkall.checked=false;
	else if(document.getElementById("box1").checked==true&&document.getElementById("box2").checked==true)
	checkall.checked=true;
}
function tot_plc(){
	var f,g,c,d=0;
	if(document.getElementById("box1").checked==true){
		f=document.getElementById("text").value;
		c=document.getElementById("qlt_unit").innerText;
	}
	else{
		f=0;
		c=0;
	}
		if(document.getElementById("box2").checked==true){
		g=document.getElementById("text_1").value;
		d=document.getElementById("qlt_unit_1").innerText;
	}
	else{
		g=0;
		d=0;
	}
		document.getElementById("count_1").innerText=parseInt(f)+parseInt(g);
		document.getElementById("qlt_2").innerText=parseFloat(c)+parseFloat(d);
}
text.onmouseout=function(){
		qlt_unit.innerText=text.value*qlt.innerText;
}
bt_12.onclick=function(){
	var del1=document.getElementById("bt_12").parentNode.parentNode;
	del1.parentNode.removeChild(del1);
}
bt_13.onclick=function(){
	var del1=document.getElementById("bt_13").parentNode.parentNode;
	del1.parentNode.removeChild(del1);
}

