. ../env.sh

echo "Running application as fat JAR as follows:"
echo "java $JAVA_OPTIONS --add-modules java.xml.bind -jar mod.app-0.0.1-SNAPSHOT.jar"
$JAVA_HOME/bin/java $JAVA_OPTIONS --add-modules java.xml.bind -jar src/mod.app/target/mod.app-0.0.1-SNAPSHOT.jar 2>&1
