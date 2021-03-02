#!/bin/sh
cd terminal_compile
javac -sourcepath ./src -d build/classes -cp ./libs/commons-lang3-3.11.jar:./libs/commons-collections4-4.3.jar src/ua/com/alevel/check/Check.java  src/ua/com/alevel/count/Count.java  src/ua/com/alevel/Main.java
java -cp build/classes/:./libs/commons-lang3-3.11.jar:./libs/commons-collections4-4.3.jar:. ua.com.alevel.Main

cd ../ant_compile
ant clean
ant compile
ant jar
ant run

cd ../maven_compile/maven_app
mvn clean install
java -jar target/maven_app-1.0-SNAPSHOT.jar