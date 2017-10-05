## Seed code - Boilerplate for step 2 - Activity Stream Assignment

### Problem Statement


### Expected solution
![alt](https://s3.ap-south-1.amazonaws.com/stackroute/oie_eqW5sRly35UA.png)

### Following are the broad tasks:
1. Create the application-context for the application. 
2. Extend AbstractAnnotationConfigDispatcherServletInitializer class WebApplicationInitializer.
3. Display the list of existing messages from the database. Each message should contain senderName, message, and timestamp. send a message which should contain the senderName, message, and timestamp.
4. Implement the MessageDAO interface and annotate with @Repository annotation in MessageDAOImpl.

### Project structure

The folders and files you see in this repositories, is how it is expected to be in projects, which are submitted for automated evaluation by Hobbes

    Project
    |
    ├──src/main
	|	    └── com.stackroute.activitystream.config	           
	|   	        └── ApplicationContextConfig.java           // This class will contain the application-context for the application.
	|	            └── WebApplicationInitializer.java          // This class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer class.
	|	    └── com.stackroute.activitystream.controller
	|		        └── AppController.java 	                    // This class is used to control all the transactions with the database.	               
	|	    └── com.stackroute.activitystream.dao
	|		        └── MessageDAO.java                         // An interface that provides access to an underlying database (Message) or any other persistence storage.
	|	    └── com.stackroute.activitystream.daoimpl
	|		        └── MessageDAOImpl.java                     // This class is implementing the MessageDAO interface. This class has to be annotated with @Repository annotation.
	|	    └── com.stackroute.activitystream.model
	|		        └── Message.java                            // The class will be acting as the data model for the message Table in the database.
	|	    └── webapp/WEB-INF/views
    |               └── index.jsp                               // A JSP page with a form in it, which will have textboxes for Sender Name and Message content along with a Send Submit button. 
    |
    ├──src/test/java/com/stackroute/activitystream/test
    |           └── ActivityStreamTest.java     // All your test cases are written using JUnit, these test cases can be run by selecting Run As -> JUnit Test
    ├── .settings
	├── .classpath			                    // This file is generated automatically while creating the project in eclipse
	├── .hobbes   			                    // Hobbes specific config options, such as type of evaluation schema, type of tech stack etc., Have saved a default values for convenience
	├── .project			                    // This is automatically generated by eclipse, if this file is removed your eclipse will not recognize this as your eclipse project. 
	├── pom.xml 			                    // This is a default file generated by maven, if this file is removed your project will not get recognised in hobbes.
	└── PROBLEM.md  		                    // This files describes the problem of the assignment/project, you can provide as much as information and clarification you want about the project in this file

> PS: All lint rule files are by default copied during the evaluation process, however if need to be customizing, you should copy from this repo and modify in your project repo


#### To use this as a boilerplate for your new project, you can follow these steps

1. Clone the base boilerplate in the folder **assignment-solution-step2** of your local machine
     
    `git clone https://gitlab-dev.stackroute.in/activity-stream-java/step2-boilerplate.git assignment-solution-step2`

2. Navigate to assignment-solution-step2 folder

    `cd assignment-solution-step2`

3. Remove its remote or original reference

     `git remote rm origin`

4. Create a new repo in gitlab named `assignment-solution-step2` as private repo

5. Add your new repository reference as remote

     `git remote add origin https://gitlab.training.com/{{yourusername}}/assignment-solution-step2.git`

     **Note: {{yourusername}} should be replaced by your username from gitlab**

5. Check the status of your repo 
     
     `git status`

6. Use the following command to update the index using the current content found in the working tree, to prepare the content staged for the next commit.

     `git add .`
 
7. Commit and Push the project to git

     `git commit -a -m "Initial commit | or place your comments according to your need"`

     `git push -u origin master`

8. Check on the git repo online, if the files have been pushed

### Important instructions for Participants
> - We expect you to write the assignment on your own by following through the guidelines, learning plan, and the practice exercises
> - The code must not be plagirized, the mentors will randomly pick the submissions and may ask you to explain the solution
> - The code must be properly indented, code structure maintained as per the boilerplate and properly commented
> - Follow through the problem statement shared with you

### Further Instructions on Release

*** Release 0.1.0 ***

- Right click on the Assignment select Run As -> Java Application to run your Assignment.
- Right click on the Assignment select Run As -> JUnit Test to run your Assignment.