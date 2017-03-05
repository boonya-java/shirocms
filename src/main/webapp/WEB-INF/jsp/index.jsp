<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<head>
<title>shirocms后台管理系统</title>
<script
	src="${pageContext.request.contextPath}/jquery/js/jquery-1.11.1.js"></script>
<script
	src="${pageContext.request.contextPath}/jquery/js/jquery-ui-1.11.0.js"></script>
<script
	src="${pageContext.request.contextPath}/jquery/js/jquery.layout-latest.js"></script>
<script
	src="${pageContext.request.contextPath}/jquery/js/themeswitchertool.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/jquery/css/main.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/jquery/css/themes/ui-lightness/jquery-ui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/jquery/css/layout-default.css">
</head>
<body>

	<iframe name="content" class="ui-layout-center"	src="${pageContext.request.contextPath}/welcome" frameborder="0"
		scrolling="auto"></iframe>
	<div class="ui-layout-north  ui-widget-header" align="right">
		欢迎[
		<shiro:principal />
		]进入shirocms，<a href="${pageContext.request.contextPath}/logout">退出</a>
	</div>
	<div class="ui-layout-south  ui-widget-overlay" title="版权"
		style="fone-size: 12px; text-align: center; padding: 5px;">
		<strong>©</strong>2014 RuienSoft Corporation.All Rights Reserved.
	</div>
	<div class="ui-layout-west" title="功能菜单">
	    <div id="accordion">
	       
		     <div class="group">
			     <h3>
			                   系统管理
			     </h3>
				     <div>
				        <c:forEach items="${menus}" var="m"> 
					       <a href="${pageContext.request.contextPath}${m.url}" target="content">${m.name}</a><br/><br/>
					    </c:forEach>
				    </div>
			</div>
			
			<div class="group">
			     <h3>
			                   基础管理
			     </h3>
				     <div>
				        <c:forEach items="${menus}" var="m"> 
					       <a href="${pageContext.request.contextPath}${m.url}" target="content">${m.name}</a><br/><br/>
					    </c:forEach>
				    </div>
			</div>
			
			<div class="group">
			     <h3>
			                   商品管理
			     </h3>
				     <div>
				        <c:forEach items="${menus}" var="m"> 
					       <a href="${pageContext.request.contextPath}${m.url}" target="content">${m.name}</a><br/><br/>
					    </c:forEach>
				    </div>
			</div>
			
			<div class="group">
			     <h3>
			                   广告管理
			     </h3>
				     <div>
				        <c:forEach items="${menus}" var="m"> 
					       <a href="${pageContext.request.contextPath}${m.url}" target="content">${m.name}</a><br/><br/>
					    </c:forEach>
				    </div>
			</div>
		   
		   <div class="group">
			     <h3>
			                   支付管理
			     </h3>
				     <div>
				        <c:forEach items="${menus}" var="m"> 
					       <a href="${pageContext.request.contextPath}${m.url}" target="content">${m.name}</a><br/><br/>
					    </c:forEach>
				    </div>
			</div>
			
			  <div class="group">
			     <h3>
			                   订单管理
			     </h3>
				     <div>
				        <c:forEach items="${menus}" var="m"> 
					       <a href="${pageContext.request.contextPath}${m.url}" target="content">${m.name}</a><br/><br/>
					    </c:forEach>
				    </div>
			</div>
		</div>
	</div>

	<script>
		$(function() {
			$(document).ready(function() {
				$('body').layout({
					applyDemoStyles : false,
					north : {
						size : 70,
						spacing_open : 2,
						closable : true,
						resizable : false
					},
					west : {
						size : 200,
						spacing_open : 2,
						closable : true,
						resizable : true
					},
					south : {
						size : 25,
						spacing_open : 2,
						closable : true,
						resizable : false
					}
				});
				// 添加主题切换
				addThemeSwitcher('.ui-layout-north', {
					top : '35px',
					right : '20px'
				});
			});
		});
		
		$(function() {
			$("#accordion-resizer").resizable({
				minHeight : 140,
				minWidth : 200,
				resize : function() {
					$("#accordion").accordion("refresh");
				}
			});
		});

		$(function() {
			$("#accordion").accordion({
				heightStyle : "content",
				header : "> div > h3"
			}).sortable({
				axis : "y",
				handle : "h3",
				stop : function(event, ui) {
					// 当排序时，IE 不能注册 blur，所以触发 focusout 处理程序来移除 .ui-state-focus
					ui.item.children("h3").triggerHandler("focusout");
				}
			});
		});
	</script>
</body>
</html>