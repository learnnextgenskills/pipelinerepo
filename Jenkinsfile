pipeline {
    agent any
    tools {
        maven 'mvn'
        jdk 'JDK'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
         stage ('Build') {
            steps {
                sh '''cd TestMaven
                mvn -Dmaven.test.failure.ignore=true install
                '''
            }
            post {
                success {
                    sh 'echo $pwd'
                    junit 'TestMaven/target/surefire-reports/TEST-udemy.AppTest.xml' 
                }
            }
        }
    }
}
