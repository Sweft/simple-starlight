1) Download the repo: git clone https://github.com/nikhildahake/simple-starlight.git

2) Instructions that follow are for windows. Navigate to the repository in command terminal: cd simple-starlight 

3) Build the React frontend.
	a) cd frontend
	b) Install Node Packages. This is a one time process -- wait for it to complete. npm install
	c) Run the tests for frontend. Use command: npm test. There will be 7 tests. They should complete successfully.
	d) Build the frontend for deployment to springboot: npm run build


4) Build the Springboot backend.
	a) Navigate to base directory in command terminal. cd simple-starlight
	b) Clean and build the project. mvn clean install
	c) Run the tests for backend. Use command: mvn test. There is 1 test. It should complete successfully.
	d) Start the application: mvn spring-boot:run

5) To access the application in browser, navigate to: http://localhost:8080/index.html