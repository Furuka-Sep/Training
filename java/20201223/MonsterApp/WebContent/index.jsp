<%@ page contentType="text/html; charset=UTF-8"
    import="model.*" %>
    <% Monster m1=new Slime("スラキチ");%>
    <% Monster m2=new DeathBat("ゴメス");%>
    <% Monster m3=new Slime("スラッチ");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>逃げもんす</title>
</head>
<body>
<!-- monsterクラスの配列に格納して拡張for文で出力したほうが綺麗 -->
<p><%= m1.run() %></p>
<p><%= m2.run() %></p>
<p><%= m3.run() %></p>

</body>
</html>