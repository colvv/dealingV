//alert("��������Ϊ"+$("#data-table").text());
common_ajax_query();
common_ajax_json_query();
function common_ajax_json_query(param_obj) {
	$.ajax({
		url : "json/tabledata.do",
		// ����Ϊ false ���������ҳ�档
		cache : false,
		data : param_obj,
		dataType : "json",
		error : function() {
			alert("����ʧ��");
		},
		success : function(data) {
			alert(data);
			alert(data[0].id);
		}
	});
}
function common_ajax_query(param_obj) {
	$.ajax({
				url : "text/tabledata.do",
				// ����Ϊ false ���������ҳ�档
				cache : false,
				data : param_obj,
				dataType : "text",
				error : function() {
					alert("����ʧ��");
				},
				success : function(data) {
					var array = data.split('^');
					var html = "<table><thead><tr><td>id</td><td>�û�����</td><td>�û�����</td><td>�û�״̬</td>"
							+ "<td>�������</td><td>�绰����</td><td>����</td></tr></thead><tbody>";
					for ( var i = 0; i < array.length; i++) {
						var detail = array[i].split('|');
						html += "<tr class=vT_tr>";
						for ( var j = 0; j < detail.length; j++) {
							// alert(detail[j]);
							html += "<td class=vT_td>";
							html += detail[j];
							html += "</td>";
						}
						html += "</tr>";
					}
					html += "</tbody></table>"
					$(" #table_id").html(html);
					$("#table_id tr:odd").css("background-color","rgba(153, 184, 219, 0.16)");
					var lastfocus = '';
					
				}
			});
}

