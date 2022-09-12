<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleWSOpecacaoProxyid" scope="session" class="br.com.hellows.WSOpecacaoProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleWSOpecacaoProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleWSOpecacaoProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleWSOpecacaoProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        br.com.hellows.WSOpecacao getWSOpecacao10mtemp = sampleWSOpecacaoProxyid.getWSOpecacao();
if(getWSOpecacao10mtemp == null){
%>
<%=getWSOpecacao10mtemp %>
<%
}else{
        if(getWSOpecacao10mtemp!= null){
        String tempreturnp11 = getWSOpecacao10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String num01_1id=  request.getParameter("num0116");
        int num01_1idTemp  = Integer.parseInt(num01_1id);
        String num02_2id=  request.getParameter("num0218");
        int num02_2idTemp  = Integer.parseInt(num02_2id);
        int divide13mtemp = sampleWSOpecacaoProxyid.divide(num01_1idTemp,num02_2idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(divide13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 20:
        gotMethod = true;
        String num01_3id=  request.getParameter("num0123");
        int num01_3idTemp  = Integer.parseInt(num01_3id);
        String num02_4id=  request.getParameter("num0225");
        int num02_4idTemp  = Integer.parseInt(num02_4id);
        int soma20mtemp = sampleWSOpecacaoProxyid.soma(num01_3idTemp,num02_4idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(soma20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 27:
        gotMethod = true;
        String num01_5id=  request.getParameter("num0130");
        int num01_5idTemp  = Integer.parseInt(num01_5id);
        String num02_6id=  request.getParameter("num0232");
        int num02_6idTemp  = Integer.parseInt(num02_6id);
        int subtrai27mtemp = sampleWSOpecacaoProxyid.subtrai(num01_5idTemp,num02_6idTemp);
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(subtrai27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
break;
case 34:
        gotMethod = true;
        String num01_7id=  request.getParameter("num0137");
        int num01_7idTemp  = Integer.parseInt(num01_7id);
        String num02_8id=  request.getParameter("num0239");
        int num02_8idTemp  = Integer.parseInt(num02_8id);
        int multiplica34mtemp = sampleWSOpecacaoProxyid.multiplica(num01_7idTemp,num02_8idTemp);
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(multiplica34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>