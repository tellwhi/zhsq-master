# 智慧安全社区
## 华侨大学计算机学院
#
#conf/catalina.properties
#添加tomcat.util.http.parser.HttpParser.requestTargetAllow=|{}
#在conf/server.xml中的<Connector>节点中，添加2个属性：
relaxedPathChars="|{}[],"
relaxedQueryChars="|{}[],"