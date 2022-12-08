Project = coffee_shop


StartDB :
	mvn compile exec:java -Dexec.mainClass="com.$(Project).cli.SQLiteMigration"

StartApp :
	mvn compile exec:java -Dexec.mainClass="com.$(Project).MainApplication"



DBTest :
	mvn compile exec:java -Dexec.mainClass="com.$(Project).Testing.DbTest"

InsertTest :
	mvn compile exec:java -Dexec.mainClass="com.$(Project).Testing.InsertTest"

SayHayTest :
	mvn compile exec:java -Dexec.mainClass="com.$(Project).Testing.SayHayTest"