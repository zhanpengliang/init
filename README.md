# init
集成spring与mybis框架

启动步骤：
1. 创建数据库与表：  详见文件etc/db/db.sql
2. 修改与数据库建立连接的url、用户名、密码。
3. 启动MySql数据库。

4. 启动应用服务。
5. 访问应用服务：
传输方式:POST
Content-Type:application/json
URL:http://ip:端口/maven-spring-mybatis/test/testInsert
内容:
{
	"content": "test"
}

