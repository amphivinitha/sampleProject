pipeline {
         agent any
         stages {
                 stage('One') {
                 steps {
                     echo 'Hi, this is Zulaikha from edureka'
                 }
                 }
                 stage('Two') {
                 steps {
                    input('Do you want to proceed?')
                 }
                 }
                 stage('Three') {
                 when {
                       not {
                            branch "master"
                       }
                 }
                 steps {
                       echo "Hello"
                 }
                 }
                 stage('Four') {
                 parallel { 
                            stage('Unit Test') {
                           steps {
                                echo "Running the unit test..."
                           }
                           }
                            stage('Integration test') {
                              agent {
                                    label "windows"
                                }
                              steps {
                                echo "Running the integration test..."
                              }
                           }
                           }
                           }
                  stage("windows") {
                    agent {
                        label "windows"
                    }
                    steps {
                        bat "mvn clean install -Dconcurrency=1 -Dmaven.test.failure.ignore=true -Dcodenarc.skip=true -Djenkins.test.timeout=${TEST_TIMEOUT}"
                    }
                    post {
                        always {
                            junit testResults: '*/target/surefire-reports/*.xml', keepLongStdio: true
                        }
                    }
                }
              }
         
}
