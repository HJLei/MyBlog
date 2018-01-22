<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/8
  Time: 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>人生如只如初见</title>
<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet" type="text/css">
    <script src="${pageContext.request.contextPath}/js/bootstrap/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/area.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/WebCalendar.js" type="text/javascript"></script>
</head>
<body style="background-image:url('images/index.jpg');">
	<figure>
	<p>
		<a class="emails" target="_blank"
			href="http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&amp;email=HHh9cn95b3F1cHVye1xtbTJ-c3E"
			title="email"></a> <a class="rssdy" target="_blank"
			href="/e/web/?type=rss2" title="rss订阅"></a> <a class="fav"
			target="_blank"
			onClick="window.external.addFavorite('http://www.yangqq.com')"
			title="加入收藏"></a>
	</p>
	</figure>
	<header>
	<h1>
		<a href="/">人生只如初见</a>
	</h1>
	<p>苍茫大地一剑尽挽破，何处繁华笙歌落。斜倚云端千壶掩寂寞，纵使他人空笑我。</p>
	</header>
	<!--nav begin-->
	<div id="nav">
		<ul>
			<li><a href="index.jsp">网站首页</a></li>
			<li><a href="" title="个人中心">个人中心</a></li>

			<s:if test="#session.LoginUser != null">
				<li><a href=""
					title="注销" onclick="removeLongName()">注销</a></li>
			</s:if>
			<s:else>
			<li><a href="login.jsp" title="登录">登录</a></li>
			</s:else>
			<s:if test="#session.LoginUser.state == 2">
			<li><a href="${pageContext.request.contextPath}/admin/admin.jsp">后台管理</a></li>
			</s:if>
		</ul>
	</div>
    <!--天气-->
    <div class="tianqi" >
        <div class="header">
            <p><label class="diqu"></label></p>
            <p><label class="btn">[切换城市]</label></p>
        </div>
        <!--弹出层（选择城市）-->
        <div class="cityBox">
            <div class="head">
                <span class="title">选择城市</span>
                <span class="close" onclick="closeFun()">关闭</span>
            </div>
            <div class="cont">
                <div class="c1">
                    <label class="bt">省/直辖市：</label>
                    <ul class="list" id="province"></ul>
                </div>
                <hr/>
                <ul class="list" style="width: 100%;margin-left: 20px" id="city"></ul>
            </div>
        </div>
        <div class="content2">
            <div class="textTitle">
                <span id="date"></span>&nbsp;&nbsp;<span>实时温度(</span>
                <span id="wendu"></span>
                <span><span style="font-size: 12px">℃</span>)</span>
                <label style="color: red"> 温馨提示：<span id="tishi"></span></label>
            </div>
            <div class="text1">
                <div class="tqImg"><img id="img1" src=""/></div>
                <div class="xinxi">
                    <label><span id="low1"></span><span class="dao">～</span><span id="high1"></span></label>
                </div>
                <div class="xix1" id="type1"></div>
                <div class="xix1" id="lixiang1"></div>
                <div class="xix1" id="aqi"></div>
            </div>
            <div class="text2">
                <div class="riqi" id="one" ></div>
                <div class="tqImg2"><img id="img2" src="" alt=""/></div>
                <div class="xinxi2">
                    <label><span id="low2"></span><span class="dao">～</span><span id="high2"></span></label>
                </div>
                <div class="xix2" id="type2"></div>
                <div class="xix2" id="lixiang2"></div>
            </div>
            <div class="text2">
                <div class="riqi" id="two" ></div>
                <div class="tqImg2"><img id="img3" src="" alt=""/></div>
                <div class="xinxi2">
                    <label><span id="low3"></span><span class="dao">～</span><span id="high3"></span></label>
                </div>
                <div class="xix2" id="type3"></div>
                <div class="xix2" id="lixiang3"></div>
            </div>
            <div class="text2">
                <div class="riqi" id="three" ></div>
                <div class="tqImg2"><img id="img4" src="" alt=""/></div>
                <div class="xinxi2">
                    <label><span id="low4"></span><span class="dao2">～</span><span id="high4"></span></label>
                </div>
                <div class="xix2" id="type4"></div>
                <div class="xix2" id="lixiang4"></div>
            </div>
            <div class="text2">
                <div class="riqi" id="fore" ></div>
                <div class="tqImg2"><img id="img5" src="" alt=""/></div>
                <div class="xinxi2">
                    <label><span id="low5"></span><span class="dao">～</span><span id="high5"></span></label>
                </div>
                <div class="xix2" id="type5"></div>
                <div class="xix2" id="lixiang5"></div>
            </div>
        </div>
  	</div>

	<!--nav end-->
	<div class="lace_hd_ft"></div>
	<article>
	<div class="blog">
		<h3>
			<p>
				最新文章<span>New Blog</span>
			</p>
		</h3>

		<div class="bloglist">
			<s:iterator value="bean.data"  var="obj" status="ids">
				<h2>
					<a
						href="articleAction_articleDetail?article.articleId=${obj[0].articleId}">${obj[0].articleTitle }
					</a>
				</h2>
				<p>
					类型：${obj[0].articleType}
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 时间：${obj[0].articleTime}
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 点击量：${obj[0].clickCount}
				</p>
				<br />
				<ul class="content">
					<s:property value="articleSummary" />${obj[0].articleSummary}
				</ul>
				<p class="read">
					<a href="articleAction_articleDetail?article.articleId=${obj[0].articleId}">阅读>></a>
				</p>
			</s:iterator>
		</div>

		<div class="page">
			共查询到${bean.allNum}条数据，共${bean.allPage }页，当前第${bean.cpage }页
			<a href="articleAction_findArticleForPage?bean.cpage=1">首页</a> <a
				href="articleAction_findArticleForPage?bean.cpage=${(bean.cpage-1)>0?bean.cpage-1:bean.cpage}">上页</a> <a
				href="articleAction_findArticleForPage?bean.cpage=${(bean.cpage+1)>bean.allPage?bean.cpage:bean.cpage+1}">下页</a> <a
				href="articleAction_findArticleForPage?bean.cpage=${bean.allPage}">尾页</a>
		</div>
	</div>

	<aside> <!-- 	 <img src="images/about.png" class="about"> -->

	<h2>博主个人简介</h2>
	<div class="vcard">
		<p id="nickname"></p>
		<p id="bTel"></p>
		<p id="bAddress"></p>
		<p id="bemail"></p>
		<p id="bhobby"></p>
	</div>
	
	<h2>文章搜索</h2>
	<form action="articleAction_findArticleForPage?bean.cpage=1" method="post">
		<ul>
			<li><input type="text" placeholder="按题目" name="querys"  class="input" style="width:150px; line-height:17px;display:inline-block" /></li>
          	</br>
          	<li><input type="text" placeholder="按类型" name="querys"  class="input" style="width:150px; line-height:17px;display:inline-block" /></li>
			</br>
			<li><input type="text" placeholder="按时间" name="querys"  onclick="selectDate(this,'yyyy-MM-dd ')" class="input" style="width:150px; line-height:17px;display:inline-block" /></li>
            </br>
			<li><input name="" type="submit" value="搜索" class="spbg buttombg f14  sale-buttom" /></li>
		</ul>
	</form>

	<h2>热文推荐</h2>
	<ul>
		<s:iterator value="articleList" status="st">
			<s:if test="#st.Count <= 5">
				<li><a
					href=""><s:property
							value="articleTitle" /> </a><a style="float: right;">(<s:property
							value="clickCount" />)</a>
			</s:if>
		</s:iterator>
	</ul>

	<h2>近期文章</h2>
	<ul>
		<s:iterator value="articleList" status="st">
			<s:if test="#st.Count <= 5">
				<li><a
					href=""><s:property
							value="articleTitle" /> </a>
			</s:if>
		</s:iterator>
	</ul>
<!-- 	<h2>文章归档</h2>
	<ul>
		<s:iterator value="timeList">
			<li><a href="/"><s:date name="articleTime" format="yyyy年MM月 " /></a></li>
		</s:iterator>
	</ul> -->
	<h2>友情链接</h2>
	<ul>
                <li><a href="http://localhost:8080/MyBlog">个人博客</a></li>
	</ul>
	<!-- Baidu Button BEGIN -->
	<div id="bdshare"
		class="bdshare_t bds_tools_32 get-codes-bdshare share">
		<a class="bds_tsina"></a> <a class="bds_qzone"></a> <a class="bds_tqq"></a>
		<a class="bds_renren"></a> <span class="bds_more"></span>
	</div>

	<script type="text/javascript" id="bdshare_js"
		data="type=tools&amp;uid=6574585"></script> <script
		type="text/javascript" id="bdshell_js"></script>
		<script type="text/javascript">
			document.getElementById("bdshell_js").src = "http://bdimg.share.baidu.com/static/js/shell_v2.js?cdnversion="
					+ Math.ceil(new Date() / 3600000)
		</script> <!-- Baidu Button END --> </aside> </article>
	
	<div class="blank"></div>
	<div id="copright">© 万场快乐千场醉，世上闲人地上仙。</div>
	<script src="js/silder.js"></script>


</body>
</html>
<script type="text/javascript">
    /**
     * 异步查询博主个人简介信息
     */
    function loadData(){
        $.post("userAction_findMyInfo","",function(data){
            $.each(data.ulist,function(i,v){
               $("#nickname").html("博主:"+v.bnickName);
                $("#bTel").html("个性签名:"+v.bsign);
                $("#bAddress").html("地址:"+v.bAddress);
                $("#bemail").html("邮箱:"+v.bemail);
                $("#bhobby").html("爱好:"+v.bhobby);
            });
        },"json");

    }
    window.onload=loadData;


    <!--天气-->
    $(function(){
        var this_ity;
        $.getScript('http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js', function(_result) {
            if (remote_ip_info.ret == '1') {
                this_ity=remote_ip_info.city;
                var myDate = new Date();
                var thisDate=myDate.getMonth()+1;
                $.getScript('http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js', function(_result) {
                    $.ajax({
                        type: "GET",
                        url: "http://wthrcdn.etouch.cn/weather_mini?city="+this_ity,
                        dataType: "json",
                        success: function(data){
                            if(data.status==1000){
                                var idType=[$("#date"),$("#one"), $("#two"),$("#three"), $("#fore")];
                                var subzero=[$("#low1"),$("#low2"),$("#low3"),$("#low4"),$("#low5")];
                                var  heat=[$("#high1"),$("#high2"),$("#high3"),$("#high4"),$("#high5")];
                                var tqtype=[$("#type1"),$("#type2"),$("#type3"),$("#type4"),$("#type5")];
                                var lixiang=[$("#lixiang1"),$("#lixiang2"),$("#lixiang3"),$("#lixiang4"),$("#lixiang5")];
                                var date=[];
                                var fengxiang=[];
                                var fengli=[];
                                var high=[];
                                var high2=[];
                                var low=[];
                                var low2=[];
                                var type=[];
                                var json=data.data;
                                $(".diqu").html(json.city);
                                $("#wendu").html(json.wendu);
                                $("#tishi").html(json.ganmao);
                                $("#aqi").html("实时空气质量："+json.aqi);
                                var forecast=json.forecast;
                                for(var i=0;i<forecast.length;i++){
                                    date[i]=forecast[i].date;
                                    fengxiang[i]=forecast[i].fengxiang;
                                    fengli[i]=forecast[i].fengli;
                                    high[i]=(forecast[i].high).substring(3,6);
                                    high2[i]=(forecast[i].high).substring(3,5);
                                    low[i]=(forecast[i].low).substring(3,6);
                                    low2[i]=(forecast[i].low).substring(3,5);
                                    type[i]=forecast[i].type;
                                }
                                bgFun(type[0]);
                                for(var j=0;j<forecast.length;j++){
                                    idType[j].html(thisDate+"月"+date[j]);
                                    subzero[j].html(low[j]);
                                    heat[j].html(high[j]);
                                    tqtype[j].html(type[j]);
                                    lixiang[j].html(fengxiang[j]+fengli[j]);
                                }
                                typeFun(type[0],img1);
                                typeFun(type[1],img2);
                                typeFun(type[2],img3);
                                typeFun(type[3],img4);
                                typeFun(type[4],img5);
                                var myChart = echarts.init(document.getElementById('myChart'));
                                var option = {
                                    chart: {
                                        backgroundColor: '#f2f2f2',
                                        style: {
                                            fontFamily: "Microsoft YaHei UI",
                                            fontSize: '12px',
                                            fontWeight: 'bold',
                                            color: '#006cee'
                                        }
                                    },
                                    title: {
                                        text: '未来五天的天气情况',
                                        subtext: '温度趋势'
                                    },
                                    tooltip: {
                                        trigger: 'axis'
                                    },
                                    legend: {
                                        data: ['最高气温', '最低气温']
                                    },
                                    toolbox: {
                                        toolbox: {
                                            show: true,
                                            feature: {
                                                dataZoom: {
                                                    yAxisIndex: 'none'
                                                },
                                                dataView: {readOnly: false},
                                                magicType: {type: ['line', 'bar']},
                                                restore: {},
                                                saveAsImage: {}
                                            }
                                        }
                                    },
                                    xAxis: [
                                        {
                                            type: 'category',
                                            boundaryGap: false,
                                            data: date
                                        }
                                    ],
                                    yAxis: [
                                        {
                                            type: 'value',
                                            axisLabel: {
                                                formatter: '{value} ℃'
                                            }
                                        }
                                    ],
                                    series: [
                                        {
                                            type: 'line',
                                            name: '最高气温',
                                            color: '#C90000',
                                            data: high2
                                        },
                                        {
                                            type: 'line',
                                            name: '最低气温',
                                            color: '#239B0E',
                                            data: low2
                                        }
                                    ]
                                };
                                myChart.setOption(option);
                            }else{
                                alert("获取数据错误")
                            }
                        }
                    });
                });
//                return this_ity

            } else {
                alert('没有找到匹配的IP地址信息！');
            }
        });

    });

    function cityBtn(obj){
        closeFun();
        var cityS=$(obj).html();
        var myDate = new Date();
        var thisDate=myDate.getMonth()+1;
        $.getScript('http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js', function(_result) {
            $.ajax({
                type: "GET",
                url: "http://wthrcdn.etouch.cn/weather_mini?city="+cityS,
                dataType: "json",
                success: function(data){
                    if(data.status==1000){
                        var idType=[$("#date"),$("#one"), $("#two"),$("#three"), $("#fore")];
                        var subzero=[$("#low1"),$("#low2"),$("#low3"),$("#low4"),$("#low5")];
                        var  heat=[$("#high1"),$("#high2"),$("#high3"),$("#high4"),$("#high5")];
                        var tqtype=[$("#type1"),$("#type2"),$("#type3"),$("#type4"),$("#type5")];
                        var lixiang=[$("#lixiang1"),$("#lixiang2"),$("#lixiang3"),$("#lixiang4"),$("#lixiang5")];
                        var date=[];
                        var fengxiang=[];
                        var fengli=[];
                        var high=[];
                        var high2=[];
                        var low=[];
                        var low2=[];
                        var type=[];
                        var json=data.data;
                        $(".diqu").html(json.city);
                        $("#wendu").html(json.wendu);
                        $("#tishi").html(json.ganmao);
                        if(json.aqi!=undefined){
                            $("#aqi").html("实时空气质量："+json.aqi);
                        }else{
                            $("#aqi").html("");
                        }
                        var forecast=json.forecast;
                        for(var i=0;i<forecast.length;i++){
                            date[i]=forecast[i].date;
                            fengxiang[i]=forecast[i].fengxiang;
                            fengli[i]=forecast[i].fengli;
                            high[i]=forecast[i].high.substring(3,6);
                            high2[i]=(forecast[i].high).substring(3,5);
                            low[i]=forecast[i].low.substring(3,6);
                            low2[i]=forecast[i].low.substring(3,5);
                            type[i]=forecast[i].type;
                        }
                        bgFun(type[0]);
                        for(var j=0;j<forecast.length;j++){
                            idType[j].html(thisDate+"月"+date[j]);
                            subzero[j].html(low[j]);
                            heat[j].html(high[j]);
                            tqtype[j].html(type[j]);
                            lixiang[j].html(fengxiang[j]+fengli[j]);
                        }
                        typeFun(type[0],img1);
                        typeFun(type[1],img2);
                        typeFun(type[2],img3);
                        typeFun(type[3],img4);
                        typeFun(type[4],img5);
                        var myChart = echarts.init(document.getElementById('myChart'));
                        var option = {
                            chart: {
                                backgroundColor: '#f2f2f2',
                                style: {
                                    fontFamily: "Microsoft YaHei UI",
                                    fontSize: '12px',
                                    fontWeight: 'bold',
                                    color: '#006cee'
                                }
                            },
                            title: {
                                text: '未来五天的天气情况',
                                subtext: '温度趋势'
                            },
                            tooltip: {
                                trigger: 'axis'
                            },
                            legend: {
                                data: ['最高气温', '最低气温']
                            },
                            toolbox: {
                                toolbox: {
                                    show: true,
                                    feature: {
                                        dataZoom: {
                                            yAxisIndex: 'none'
                                        },
                                        dataView: {readOnly: false},
                                        magicType: {type: ['line', 'bar']},
                                        restore: {},
                                        saveAsImage: {}
                                    }
                                }
                            },
                            xAxis: [
                                {
                                    type: 'category',
                                    boundaryGap: false,
                                    data: date
                                }
                            ],
                            yAxis: [
                                {
                                    type: 'value',
                                    axisLabel: {
                                        formatter: '{value} ℃'
                                    }
                                }
                            ],
                            series: [
                                {
                                    type: 'line',
                                    name: '最高气温',
                                    color: '#C90000',
                                    data: high2
                                },
                                {
                                    type: 'line',
                                    name: '最低气温',
                                    color: '#239B0E',
                                    data: low2
                                }
                            ]
                        };
                        myChart.setOption(option);
                    }else{
                        alert("获取数据错误")
                    }

                }
            });
        });
    }
    function closeFun() {
        $("#province").html("");
        $("#city").html("");
        $(".cityBox").hide();
    }
    //注销登录
    function removeLongName(){
        if(confirm("确定要退出登录吗？")) {
            $.post("userAction_removeLongName",null,function(data){
                if(data.msg==1){
                    alert("退出登录成功！");
                }else{
                    alert("退出失败！");
                }
            });
            return true;
        }
        else {
            return false;
        }
    }
</script>

