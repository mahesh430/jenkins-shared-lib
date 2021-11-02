def call(String repoUrl){
  
  pipeline {
    agent any
    stages{
      
      stage('Tools initilization')
      {
        steps{
        sh "mvn --version"
        sh "mvn --version"
        }
      }
      stage('Code checkout')
      {
        steps{
         git branch: 'master'
          url: "${repUrl}"
        }
        
      }
      
      
    }
    
    
  }
  
}
