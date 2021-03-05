#!/bin/sh
javac -sourcepath ./src -d build/classes -cp ./libs/commons-lang3-3.11.jar:./libs/commons-collections4-4.3.jar src/ua/com/alevel/check/Check.java  src/ua/com/alevel/count/Count.java  src/ua/com/alevel/Main.java
java -cp build/classes/:./libs/commons-lang3-3.11.jar:./libs/commons-collections4-4.3.jar:. ua.com.alevel.Main