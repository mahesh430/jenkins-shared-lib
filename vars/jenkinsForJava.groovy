def call(String repoUrl) {
  pipeline {
       agent any

       stages {

           stage("Checkout Code") {
               steps {
                   git branch: 'master',
                       url: "${repoUrl}"
                 echo "${repoUrl}"
               }
           }
           stage("Cleaning workspace") {
               steps {
                   echo 'Cleaning'
               }
           }
           stage("Running Testcase") {
              steps {
                   echo 'Test cases'
               }
           }
           stage("Packing Application") {
               steps {
                   echo 'Packingg'
               }
           }
       }
   }
}
