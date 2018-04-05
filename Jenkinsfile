pipeline {
    agent any
    def server
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
        stage ('Sonar') {
            steps {
                
                            // Github plugin for PR's (does not submit to server)
                            sh '~/sonar-scanner-3.0.3.778-linux/bin/sonar-scanner'
                
    }
        }
         stage ('Artifactory configuration') {
          // Obtain an Artifactory server instance, defined in Jenkins --> Manage:
             steps {
             server = Artifactory.server SERVER_ID
             sh 'echo ${SERVER_ID}'
             }
         }
    }
}
