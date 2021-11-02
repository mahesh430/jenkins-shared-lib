
pipeline{
  
  agent any
  tools {
     maven 'Maven 3.5.0'
     jdk 'jdk8'
  }
  stages{
    stage('Tools initilization'){
       steps {
                   sh "mvn --version"
                   sh "java -version"
               }
    }
    
    
  }
  
}
