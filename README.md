
# Featured News




## Team Members

	1.Rudransh Bhardwaj


## Objective
	To obtain all of the most recent news items currently accessible on the Be.Cognizant website.

## Detailed Description
	1. The goal of the project is to gather user data from the Be.Cognizant website's top-right corner. The name, employee ID, and email address of the employee may be included in this data.  

	2. The next step is to extract the headlines from each news article that is presented on the Be.Cognizant website under the "Featured News" section. The headlines of news items are often included in this part to give a concise synopsis of the content.


	3. The primary goal is to acquire the in-depth news articles that are shown beneath each headline in the "Featured News" area of the Be.Cognizant website.


##  Installation Instructions
	•Open Eclipse and go to File > New > Other. In the New Project window, select Maven > Maven Project and click Next.
	•In the New Maven Project window, select Create a simple project (skip archetype selection) and click Next.
	•In the New Maven Project window, enter the Group Id and Artifact Id for the project. The Group Id is typically the package name for the project, and the Artifact Id is the name of the project. Click Next.
	•In the New Maven Project window, select the location where you want to create the project and click Finish.
	•Once the project is created, go to the pom.xml file and add the Selenium and TestNG dependencies by adding the following code:

	1.Add Selenium dependency on pom file
	2.Add TestNG plugin in Eclipse
	3.Add TestNG dependency on pom files
	
	•Save the pom.xml file and then right-click on the project in the Project Explorer and select Maven > Update Project. This will download the Selenium and TestNG dependencies and updatethe project.
	•To create a Selenium TestNG class, right-click on the project in the Project Explorer and select New > Other. In the New window, select TestNG TestNG Class and click Next.
	•In the TestNG Class window, enter the name of the class and select the package where you want to create the class. Click Finish.
	•In the Selenium TestNG class, add the TestNG annotations such as @Test, @BeforeClass, @AfterClass, etc. to create the test methods.
	•Inside the test methods, create a WebDriver instance and write the Selenium code to interact with the web elements on the page.
	•To run the Selenium TestNG tests, right-click on the TestNG class and select Run As > TestNG Test. This will run all the test methods in the class.

## Usage
	•The goal of this project is to gather the top headlines and most popular news stories from the Be.Cognizant website and analyse them further. The project will employ web scraping techniques to extract the pertinent information from the website's HTML code in order to do this.
	•The project's first step is to find the "Featured News" section of the Be.Cognizant website and extract the headlines from each news article that is displayed there. Finding the appropriate HTML tags and class names that hold the headline data will include searching for them.
	•The project will then extract the in-depth news items associated with each headline. The project will once more access each news article's unique page using web scraping to extract the relevant data.
	•Once the headlines and news articles are extracted, the project will compile them into a document, such text file.
	•The final output of the project will be a text document containing all the extracted headlines and news articles, which can be used for further analysis or to keep track of the latest updates and developments related to Be.Cognizant.


## Features
	This project's goal is to gather the headlines and top news stories from the Be.Cognizant website and organise them into a document for additional research.

## Documentation
	Java class named FeaturedNewsPage in the mainProject.featuredNews package. It extends the Browsers class.

	Here's a breakdown of the class structure and methods:

	1.The class inherits the Browsers class by calling its constructor.
	2.There is a Screenshot object named capture for capturing screenshots.
	3.The class defines three locators using the By class to locate elements on the webpage: userIcon, name, and mail.
	4.The getUserDetails method performs the following actions:
		◦Waits for the presence of the userIcon element.
		◦Clicks on the userIcon element.
		◦Retrieves the text of the name and mail elements.
		◦Prints the name and mail text.
		◦Takes a screenshot using the capture object.
	5.The NewsTitle locator is defined to locate news titles on the webpage.
	6.The getTextOfHeadings method retrieves the text of all news headings on the page and prints them.The News method performs the following actions:
		◦Retrieves a list of news elements on the webpage.
		◦Iterates through each news element.
		◦Retrieves the text of the news header and trims it.
		◦Generates a file name based on the trimmed header text.
		◦Deletes the file if it already exists.
		◦Retrieves the text of each paragraph in the news article and writes it to the file.
		◦Takes a screenshot using the capture object.
		◦Navigates back to the previous page.

	The code you provided appears to be a test case class for a feature called "Featured News" in a larger project. The test case class is written in Java and uses the TestNG testing framework. Here is a breakdown of the code:
		1.The package declaration specifies that the class belongs to the mainProject.featuredNews package.
		2.The class extends the Browsers class, which likely contains common browser-related methods and configurations.
		3.The constructor of the class initializes the parent class (Browsers) by calling its constructor.
		4.Two class-level variables are declared:
			HeadingList of type ListOfNewsHeadings and newsPage of type FeaturedNewsPage. These variables are used to interact with the list of news headings and the featured news page, respectively.
		5.The @BeforeClass annotation marks the following method (Driversetup()) to be executed before the test class. In this method, the browser is invoked and the title of the web page is printed.
		6.The @Test annotation marks the following method (Userdetails()) as a test case. This test case calls the getUserDetails() method from the newsPage object, logs the test status and user details using an ExtentReports logger.
		7.Another @Test annotated method (Headings()) retrieves the text of news headings by calling getTextOfHeadings() from the newsPage object. It then invokes Headinglist() from the HeadingList object. The test status and news heading details are logged.
		8.The next @Test annotated method (TextOfNews()) retrieves the text of news articles by calling News() from the newsPage object. The test status and news text are logged.
		9.The @AfterClass annotation marks the following method (CloseBrowser()) to be executed after all the test methods have been executed. In this method, the browser() method from the newsPage object is called to close the browser. Overall, this class defines test cases for retrieving user details, news headings, and news articles from a featured news page. The test results are logged using the ExtentReports library, and the browser is invoked and closed before and after the test execution using methods from the Browsers class.

## Key Automation Scope
	1.Selenium Webdriver and it's concepts.
	2.TestNG framework and it's concepts.
	3.Core java Concepts
	4.MultiWindows concept
	5.Cross Browsers Testing concepts(Chrome, Edge, Firefox).
	6.Create Extent Report
	7.Capture The Screenshots,
	8.Data Pushed to the text files,
	9.Property file concepts.
	10.Page Object Model.
	11.Cucumber

## OutPut
	OutPut: 

Sign in to your account
!...........UserDetails.............!
Bhardwaj, Rudransh (Contractor)
2266635@cognizant.com
_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _
Be.Cognizant - Home
!...........NewsHeadings.............!
CFO Jan Siegmund lives — and leads — with pride
Inside Cognizant and Tidal’s mission to transform the Blue Economy
Women in Engineering: Recognizing Women’s Contribution to Engineering
Wins and deals: Across every industry, companies are choosing Cognizant
CEO blog: Watch my interview with CNBC India
_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _  _
1 News Article
CFO Jan Siegmund lives — and leads — with pride
CFO Jan Siegmund lives   and leads   with pride
As Cognizant’s CFO and Executive Sponsor of the Embrace LGBTQ+ affinity group, Jan Siegmund leads the company toward growth while inspiring associates to show up as their authentic selves. In the interview below, Jan reveals the unlikely path that led him to a career in finance, along with the three “lighthouses” that guide him in his work every day. You’ll also learn about his vision for inclusion within the company and why he recently rode his bike from Boston all the way to New York. 

Q: You were a CFO before taking the role at Cognizant, but you haven’t spent your career in traditional finance roles. How did you become a CFO?  

A: Completely by surprise! I always loved economics and studied it. My father worked for the Federal Reserve bank of Germany. But I wasn’t a traditional accountant. I view myself as a strategic change agent with an affinity for numbers. When I learned the expectations of the role, though, I saw that my background could actually help me succeed and I got very excited.  

The lesson is that careers take unexpected paths. Be open to opportunities when they offer themselves. 
 
Q: Most people have a general idea of a CFO’s role. How would you describe what you do if you were having lunch with an acquaintance? 

A: I like to say I have three “lighthouses” that guide me.  

All of us can get lost in the daily jungle of meetings and decisions. Having “lighthouses” make sure your work supports your goals. 
  
Q: You proudly bring yourself to work each day and you’re the executive sponsor of our Embrace LGBTQ+ group here at Cognizant. When you were in talks to become CFO, what conversations did you have with leadership about what you wanted to see Cognizant do when it came to inclusion? 

A: I discussed it in every meeting in my interview process. Will the company value me as a member of the LGBTQ+ community? Are you serious about the support of minorities and inclusion?  

I could see that Cognizant was highly committed to diversity and there was a sincere effort by senior leaders to make even more progress. They viewed me being a gay man as a distinct advantage. I was excited because I knew I could come in at a senior position where I could make a difference.   


Q: Where do you see Cognizant when it comes to LGBTQ+ inclusion?  

A: Inclusion is a high goal. It doesn’t mean to simply tolerate. It means to celebrate different characteristics of the individual. We still have a few steps to go. That has to do with being a global company, and different countries have different states of integration and acceptance.  

I want everyone in Cognizant to feel comfortable bringing their full selves to work every day. The Embrace leadership team and I are proud that we achieved a 100% rating in the U.S. on the Human Rights Campaign’s Best Places to Work. We also made great progress last year in celebrating Pride in India. So, one of the priority areas for Embrace is to launch initiatives so that everybody feels comfortable to be as out as I can in my position, recognizing that I’m quite privileged in my role.  
 
Q: What is your message to associates who might be hesitant to bring their full selves or their diversity to work? 

A: First, everybody should take their time to find a comfortable space. For LGBTQ+ associates, there is no mandate to be out at work. It’s an option. I will say, for me it was one of the best decisions I ever made because I felt that by being out and authentic, I found people had more trust in me.  

To take the question in a slightly different direction, I think it’s crucial that we have a large set of allies supporting our diverse communities. I want to give a big shout out to our Embrace and LGBTQ+ allies in India. If you are a young team member who wants to come out and you see an ally with a rainbow flag at work, just a natural, small step like that, that signal is so important for the person who wants to come out.  
Also, every associate needs to understand that HR and senior leadership have a zero tolerance for discrimination. If there are situations where you or a colleague doesn’t feel accepted, feels bullied or feels uncomfortable, reach out to your HR partner.  
 
Q: What are some of your favorite interactions that you’ve had at Cognizant that give you pride in being a leader here?  

A: The most heartwarming interactions have been with our trans community. They are true trailblazers for our cause because the trans community faces another level of discrimination. It takes a lot of confidence and a lot of strength to work every day. Particularly in India, there is a vocal group of associates and allies who inspire me every day. The spotlight really should be on those associates who are doing it out every day in the front lines.   
 
Q: We’ve been evolving rapidly as a company during your 2+ years here. As someone who is part of our strategy at the highest levels, what would you say to associates who are wondering where we’re going as a company or their place in it?   

A: It’s all about growth. I’ve been convinced from Day 1 that Cognizant will be successful. We have a fantastic history of success. We are famous for our client centricity. We have an entrepreneurial, can-do culture. We have built great capabilities across the globe.  

I feel super energized about the years to come because we’ll be focusing on growth. We have Ravi as our new CEO, a proven industry leader with a fantastic growth record and deep understanding of our industry. Growth is going to be exciting for our clients because they will want to work with a winner in our industry. Growth is exciting for our associates because it means more opportunities, better development and more career paths. These are good times to be part of Cognizant and I’m ready. I feel energized and I hope everybody else will too.  
 
Q: You recently got into cycling and competed in a fundraising race with other Cognizant associates. What did you enjoy most about it?  
A: Cycle for the Cause is a bike ride from Boston to New York – 275 miles over three days – that raises money to eradicate AIDS. We formed a team of almost 30 riders and support members who raised more than $150,000 as Team Cognizant in our first year of participation. 

It truly changes people’s lives and it’s an amazing team-building event. I hadn’t been on a bike for 10 years! Training with my colleagues creates a camaraderie with a team that is outside your day-to-day work colleagues. Some team members were very ambitious and fast cyclers. Others like me were cycling just for fun, to connect with others and to enjoy the ride. And we also had a group of people who really had to put all their energy together to achieve this. And so many of us did the complete ride without any interruption and made it a personal achievement for themselves. 

It also turned me into a fitness-oriented person because I learned how good I feel when I train regularly. I lost three inches in my waist. 

We’re already recruiting for next year. The Embrace page of Be.Cognizant has registration information. 

It made me feel so proud to see our riders arrive in Manhattan. The Cognizant family came through in our first year and I know the second year will be grand! 
2 News Article
Inside Cognizant and Tidal’s mission to transform the Blue Economy
Inside Cognizant and Tidal s mission to transform the Blue Economy
The world’s oceans provide food and livelihoods for billions of people, not to mention two-thirds of our oxygen supply. However, humanity has pushed this fragile resource to the breaking point—and restoring it will take nothing less than groundbreaking innovation. That’s where Cognizant and Tidal come in.  

You may have seen the recent announcement: Cognizant is embarking on a new partnership with Tidal, a Google X project dedicated to protecting the ocean and preserving its ability to sustain life. This joint venture will also help redefine the Blue Economy, which encompasses four economic sectors related to oceans, seas, and coasts: Blue Food, Blue Energy, Blue Transportation and Blue Carbon.  

To better serve these ocean-based industries, we’ve created a new business unit called Cognizant® Ocean. Led by Stig Martin Fiska, the Ocean team will work with Tidal to develop solutions that help our clients achieve a more sustainable and profitable future.  

The opportunity is significant—according to the World Bank, ocean industries contribute about $1.5 trillion to the annual global economy.  Many of these organizations are starting to accelerate their IT adoption and seeking a partner to help them digitize their operations. While it’s a new revenue stream for Cognizant, it’s also a promising one.    

“This is an area that the tech sector hasn’t been very close to,” Stig Martin explained. “These industries are really opening their arms to us and saying, ‘Finally someone wants to understand our problems and not just sell us some generic software.’”  

One of the biggest barriers to protecting our oceans is that we simply don’t know much about what’s going on under the water. The pressure is crushing, communication is difficult (GPS and WiFi don’t work underwater!), and saltwater kills electronics, which makes long-term monitoring challenging.  

To overcome these issues, Tidal developed an advanced underwater camera and machine perception tools that can withstand harsh ocean environments. In a pilot program based in Norway, the system is being used to interpret fish behaviors and collect environmental information like water temperature. The resulting data will help fish farmers make smarter decisions about how to manage their sea pens, which can help reduce both costs and pollution.  
As Tidal’s partner, we’re helping roll out the system on a global scale and developing new uses based on the technology. For instance, the same tech that’s used in aquaculture could also be used for deep-sea installations like wind farms. “By repurposing or even rebuilding the sensing devices, we can better understand deep sea habitats so that when an installation goes in, we’re not harming their environment,” Stig Martin said.   

Cognizant Ocean and Tidal teams are also starting to explore ways to improve the health of the world’s water supply. With over two billion people lacking access to clean drinking water, it’s a problem in dire need of a solution. “Climate change isn’t just threatening our oceans,” pointed out Stig Martin. "So we’re looking at some novel ideas to clean up our rivers, lakes and reservoirs as well.”  

For Stig Martin, the work is personal. Growing up in Norway where much of the country’s population is settled on the coastline, he witnessed how much the ocean impacts both the culture and the economy in his community.  

“The ocean is a huge part of our heritage,” he explained. “Shipping has been here since the 1600s, aquaculture was created here, and blue energy is a big driver for our economy. Still, working with Tidal has been a big eye-opener for me. I had no idea just how much the ocean sustains our life and humanity, so being able to work on something that has a real impact is very inspiring.”  

Read more here. 

3 News Article
Women in Engineering: Recognizing Women’s Contribution to Engineering
Women in Engineering  Recognizing Women s Contribution to Engineering
Co-authored with Nishi Rath

Today we celebrate International Women in Engineering Day where we recognize the amazing work women engineers in Cognizant are doing to make everyday lives better and are truly living our purpose.

To commemorate this day, we spoke to some of Cognizant’s women in engineering who shared their experience as an engineer at Cognizant, memorable projects they've worked on, their growth and development, their support systems and people who stood by them as they navigated many milestones in their personal and professional lives and their advice for the next generation engineers at Cognizant!


In my long journey with Cognizant, there has been multiple projects that has left me with great learning and immense satisfaction. In one of my very early engineering projects, I was assigned to maintenance and development of a critical application which could have very minimal downtime. Apart from enhancing the application for newer features, I also had the responsibility of analyzing any downtime or failure in exchanging of critical data between systems. The project was not only technically challenging but also re-emphasized that how critical our support was to enable clients to run their business.
My growth and development in Cognizant has been very natural and seamless, always rewarding for the performance. My personal milestones had no impact on the career progression because my managers and co-workers were very inclusive and provided me challenging opportunities that I grabbed and performed. I think the culture and people in Cognizant have immensely helped me grow. My managers, co-workers, my team -- together they created an ecosystem that allowed me to thrive.
I have always believed that we should go after opportunities and not wait for them to come our way. Once you take on an opportunity, stay on top of it, take full accountability until you deliver on the outcomes. This helps establish credibility that helps naturally attract the next set of opportunities. Also, to understand what opportunities exist we need to connect and network.

The initial days of my career with Cognizant was challenging right on floor into a transformation program working with a new team of just trained Agile team every day with customers moving from doing agile to being agile. Coaching the team on agile mindset and delivering the critical program, collaborating with clients and multiple vendors involved. The first MVP and release was a great success well applauded by customers for on-time delivery with highest customer satisfaction. That journey is still fresh on mind and is a motivation for many of us till date.
"Always Thriving, Never Settling" - grab the opportunities as you see or create opportunities to sail has always been the mindset which leaders keep installing in our minds. No one stops you from moving along, pushing us above the bar.
My dad has been my real supporting lifeline throughout my career. From my first step to join work as a software professional he has constantly motivated me and helped me overcome challenges.  My dad who is a retired school principal with masters in science and maths not just taught me science as a core engineering subject but as a life lesson and ways to use science across any activity we do. My engineering career has reached this stage only with his guidance and support. Any woman after having a child always has a question to continue or stop the professional career. When I had to decide on that question 10 years back, my dad instantly planned to retire and spend his days with his granddaughter supporting me with her upbringing and made a constant decision that my engineering career should not be paused for a phase in my life and helped me stand where I am today.
To all the young women aspiring to pursue a career in engineering at Cognizant, you are at the right spot to grow - nurtured with most efficient women leaders across various lines who are true role models supporting on your journey. Pause and start the journey as needed but never attempt to cease. Be yourself and live for self.




I've been with Cognizant since April 2019 and in the past 4 years I've got multiple opportunities to play various roles such as an EDL, Agile Transformation Coach/Consultant, and currently as an Agile Transformation Strategist, leading the enterprise-wide transformation for DnB (Dun and Bradstreet).
I remember working with leading provider of reinsurance where we initiated the agile transformation in one of the critical and highly visible portfolios, at the start of the pandemic. I started the transformation in the portfolio and was able to show significant improvements on delivery, collaboration, and the agile ways of working within a span of four months. The clients were delighted, I became part of their transformation COE, and I was offered to play the role of a transformation coach for three large tribes (approx. 200 folks of globally distributed, multi-vendor teams).
With this we were able to establish Cognizant’s footprints on agile transformation in the other portfolios, won new business opportunities, and Cognizant became one of their key strategic partners for their major initiatives. I should say that I got the best opportunity to use my skills and capabilities, received an amazing support from the account leaders (SBU Head, EDP, CP, EDL), appreciable collaboration with my fellow agile Coaches (from Cognizant) in the account, and it was indeed a great teamwork. The credit goes to the entire Cognizant team.
The Propel program which I completed in 2021 is a good leadership program for women where I got the opportunity to connect with the senior leaders, learned valuable tips and techniques to enhance my leadership skills.  
My parents have been my great support throughout my engineering career and especially my dad who has been very supportive and encouraging. I don’t have any role model as such, but I’ve got inspiration from one of my previous client managers and from one of my immediate bosses in my previous organization and in Cognizant. I’m inspired by their soft skills, showing warmth, being a people person, and all this has earned them a great respect from their colleagues, have made them influential leaders.
I’m more of a self-driven person, I keep raising my bar, would always look for challenging opportunities, and hence I mostly don’t look for an external motivation or even a validation from others. I choose the opportunities and my roles based on - my passion and interests, what I believe in, what my values are, where I could make an impact, and I try to put my best efforts in them.
 I would like to share a couple of suggestions/recommendations from my experience:

I would like to share one of my favorite quotes by Maya Angelou - “Each time a woman stands up for herself, she stands up for all women”.

My entire career in Cognizant has been in testing. All my efforts within Cognizant Projects/Engagements were to ensure that the client is able to do the testing of their products with accuracy within right time to meet the market demands. While meeting the client requirements, I would also ensure that Cognizant is gaining good margins and improve in business. I worked to groom our GenC associates to build the talent pool internally. This pool was utilized for internal fulfilment of the requirements.
Cognizant policies around giving equal opportunities supported me to browse different roles. My managers throughout my Cognizant career journey have been very supportive. Their guidance helped me to balance my personal responsibilities along with professional responsibilities.
Our women leaders with in CMT QEA group are a source of inspiration for me. The way they handle large proposals and account responsibilities while ensuring they take care of their health and family is inspiring. Whenever I felt low in my career journey, I looked at them for inspiration.
I have learnt that everyone faces challenges in life. We must not see the immediate situation and make large decisions instead we must take decisions by looking at our dreams. Do not hesitate to take support from family and your managers at work to plan to get you through the challenges.

I get a sense of satisfaction when I can rectify something that has gone horribly wrong. One such project was the multi-tower project in Insurance domain, under BPM practice from APAC. It was highly escalated, and the 100+ team totally burnt-out and demotivated when I joined. Most of the team had to work from a location, which was remote from the city with challenging commute system. There were inter team conflicts, and leads spent more time providing justifications to leadership and customer than doing project work. More effort was already consumed than budgeted for. Cutting a long story short, at the end we met all the milestones, the team collaboration was praise-worthy, and Cognizant got repeat business in the subsequent year.
A similar turn-around story is the project for a popular brand in the Salesforce practice, under the retail domain. Here the business spoke only Deutsche, which was an additional blocker. However, we won the subsequent support contract last year and recently won the RFP for the next run.
Learnings are most from escalated projects, be it stakeholder management, team building, time management.
EPS practice is always mindful of diversity. In my career of 12 years with Cognizant, I have always been entrusted with large, complex programs. I had the privilege to lead many initiatives on behalf of my practice (including performance management, delivery excellence, people championship etc) – each of which was enriching. Among the initiatives, the recent PROPEL program was an eye opener. It was a self-discovery journey – and helping me in nurturing my career path.
I always had very supportive mentors and supervisors in Cognizant. I would like to call out three names - Sajid Hussain from Salesforce, Krishna Prasad Yerramilli (KP) from GDO, Vivek Agarwal from BPM, who encourage growth of women leaders in their portfolio. First and foremost, they lead by example. I am influenced by the way they operate – their positivity, their leadership. The relationship with their team is built on trust and shared values. They are alert about the needs of their team, and always encourage open conversations (on goals, careers etc.). I have been entrusted with many responsibilities by them, and they always helped me propel forward.
My advise to aspiring women in engineering would be to work hard, work smart, build your network, and support system, be vocal about your asks, keep regular connect with your supervisor, do not ask for favours, take very-very good care of your health and most importantly enjoy every minute of your life!

The project for a leading American cloud computing company is always special to me where I got the chance to work with diverse skilled associates and we all worked as one family for years!  Many of them are still with Cognizant and their contribution towards the growth of our organization continues. Holding the GPOY trophy for this project is one of the proudest moments.
We have lots of internal communities and forums to help and support women employees. I was proud to be part of Cognizant’s leadership development program “Propel” Initiative, which helps to build strong women leaders. This initiative helped me with a community where we support each other and build a leadership brand and helped to expand my strategic network internally and externally.
I had a chance to work with many leaders in my career. I would like to mention and extend my sincere thanks to Senthil and Arun for their mentorship. They were always supportive and pitched in whenever I needed help. I was always amazed by their skills on staying top of things, critical thinking, decisiveness. I grew up working with them and it helped me to shape up myself on these critical traits.
Cognizant is a great place to work for women associates. Women in Cognizant have equal rights, responsibilities and opportunities. Cognizant is committed to the principles of non-discrimination and we celebrate diversity and inclusion across our workforce, in our communities and partnerships. Technical excellence, commitment and bit of hard work and work life balance can make wonders here.

My client, one of the leading US Insurer, is converting some of its Policy Admin systems (COTS as well in-house admins) to another COTS product. Cognizant is responsible for end-to-end integration, along with SME support for both admins as well as interfacing applications in a managed service model. In 2021, one of the in-house Annuity admin was converted; my SME team assisted clients with their conversion needs (analysis reports, reconciliation reports, extracts), planning all cutover activities at client's system (with backout plan) and ensuring soft as well as hard decommission post successful cutover. This was a major accomplishment as there were hardly any Client SME and entire SME support was handled by us. This success story ensured we continue to support clients in their conversion journey till 2025.    
There are multiple programs that I recollect during my stint at Cognizant, yet there are 2 specific initiatives that have touched my heart:
Over the last decade, the wave of digital transformation has spread across industries. This has meant we as knowledge workers need to constantly keep ourselves abreast of these changes and sharpen our skillsets to ride these waves of change. This is where Digital Transformation for Program Managers and Delivery Managers helped me as a manger to hone my abilities to identify and manage large scale transformation programs.
PROPEL – Accelerating a Diverse Leadership Program is the other initiative that I remember has helped me understand my strengths and boost my confidence.
They say that behind every successful man is a woman. The complementary saying should read as Behind every successful woman is a supportive family at home and supportive mentors at office. My sincere thanks to:

My advise to women engineers aspiring to pursue a great career at Cognizant would be


I'm glad to have remarkable Women and Men Leaders in Cognizant who are empowering women scale to new heights in both professional and personal space which significantly impacts economic growth, corporate success, and human development.

It’s been almost 5 years in Cognizant, getting strengthened day by day.  Firstly, I am thankful for the leaders to have trust in me and for the opportunities I’m gaining in Cognizant.
Project management is a multidisciplinary field that requires a combination of technical skills, leadership abilities and effective communication.
Inner engineering plays a significant role in empowering women by providing them with the tools and mindset needed to overcome societal barriers, embrace their unique strengths, and excel in their chosen fields. Through inner engineering practices, I got the benefit of self- reflection, problem-solving, streamline processes, being collaborative where we can develop confidence, resilience, improving leadership skills to navigate the challenges faced and to succeed in project management roles.
Best thing is to upskill us, acquiring knowledge from co-workers and cultivate in our own style and being competitor for ourselves, which in turn will gain confidence and strengthen our IQ/EQ wider day by day. Also, via collaboration by sharing the learnings to team members and vice versa, helps to build strong relationships that drive engagement and productivity. Never pulldown yourself with negative comments/feedback, even it affects us in any situation, being optimistic will raise our thoughts and action like a Phoenix bird and will be routed to right direction.
Setting clear Goals and Objectives can align the team's efforts and measure progress effectively. Effective communication is at the heart of successful project management/or any field. If we focus on developing clear and concise communication strategies, ensuring that information flows smoothly between team members, stakeholders, and clients. Also, proactively managing stakeholders' expectations and addressing their concerns, we can build trust and credibility, leading to improved project outcomes.
There have been many instances where excellent women and male leads and colleagues have inspired me in Cognizant to gain the above wisdom. Massive thanks to everyone.

As part of my engagement with a leading bank, I joined with two members from the bank and gave presentation in various vendors on the Target Operating Model. That was one of my memorable moments as like a true partner we worked with client.
My growth curve started growing north since I joined Cognizant and in every step I had mentors to show me the right way and perform to achieve project and personal aspiration.
My brother is my inspiration since I was a young kid, and he is the biggest supporting pillar of my life. Apart from my elder brother at home, I have always looked up to many seniors at Cognizant like Mandar Kelkar, Navneet Chola, Akash Das, Harsha Hegde, Rinka De, Bhaskar Chellappa, Prasad Kameswara and few more.
Life is always a juggle between managing personal and professional needs. Take some time out for yourself daily, sit back and think which area needs more attention from you for that day or during that period. Accordingly plan your day and ride your journey. Women have to take few decisions in various stages of our life and act on it. But never let your dreams die. Always remember…”If you think you can do, you will definitely achieve it”, this determination power is there in every woman and we should use this power to lead a life of our choice.

We also asked our male allies to share their thoughts for INWED. Here’s what they said.

Saransh Agarwal, Vice President Learning and Development

Cognizant's Learning and Development team accountable for skilling all our delivery associates in cutting-edge technologies is primarily driven by women leaders and specialists. Nandini Nair leads our learning technology portfolio providing an award-winning learning experience platform through MyLearningStudio. The reason I highlight these examples is that I believe engineering and technology is not a domain of one gender and it needs passionate individuals to engineer modern solutions. As we celebrate International Women's in Engineering Day, I recognize and honor the value women bring to the field of engineering and it is our collective responsibility to challenge gender biases, create inclusive environments, and amplify women's voices in engineering.
As an ally, I commit to actively listening, learning and advocating the success of each of my female colleagues and aspiring engineers. Together, let us unlock the full potential of engineering, embracing the talents and perspectives of all individuals, regardless of gender.
 
Happy International Women in Engineering Day!

Raj Dharmaraj, AVP Human Resources

International Women in Engineering Day is an occasion to highlight the incredible contribution of women across science, technology, and engineering. From getting the Apollo mission to the Moon, to enabling the Mangalyan orbiter to Mars, women technologists and leaders have been crucial to the success of programs that have accelerated progress for all of humankind. Our own IT industry, from the pioneering days of Ada Lovelace, Grace Hopper, and Hedy Lamarr, has been the beneficiary of an increasing number of women in the workforce, breaking down barriers and stereotypes. There’s been a spurt in the percentage of women employees in IT, and increasingly at leadership levels - I’m proud that Cognizant has been a role-model in championing the cause of bringing more women into the workplace across roles and geographies. I’ve had the privilege of interacting and working with incredibly accomplished women – as colleagues, mentors, teachers, advisors, and leaders – who have shaped the culture, growth, and success of the organizations they are part of. At the risk of sounding biased I believe that women in our industry invariably outperform men, on key leadership dimensions - ability to deal with complexity and ambiguity, high levels of integrity, accountability, and attention to detail, and arguably, the most important traits in today’s context, greater empathy, and resilience. In envisioning the future of IT and Cognizant, embracing and nurturing gender diversity in IT isn’t just the right choice, but a powerful strategic differentiator to thrive in our rapidly evolving technology landscape.

Ramachandran, Global Learning Delivery Lead, Learning and Development

As we celebrate INWED, let us recognize and appreciate the invaluable contributions that Women Engineers make to our world. Their brilliance, passion and dedication have broken barriers and shattered stereotypes, paving the way for a more inclusive and innovative future. Today, I stand proudly as a male ally, committed to championing gender equality in engineering and creating an environment where every individual, regardless of their gender, can thrive and succeed.

We are proud to celebrate all the women in engineering and the impact they are creating. Share with us your experiences as an engineer at Cognizant. 

Wishing everyone a Happy International Women in Engineering Day! #INWED23
Related News                                                                                                                                                                                  
4 News Article
Wins and deals: Across every industry, companies are choosing Cognizant
Wins and deals  Across every industry  companies are choosing Cognizant
Congratulations to everyone working to serve our clients, drive growth and maintain our culture—now more than ever. Here’s a sampling of recent wins, captured by the Global Sales Intelligence Cell: 

Deal: A U.S.-based nonprofit healthcare provider tapped us to provide BPO services for claims, membership, and provider operations. The scope also covers software development and maintenance as well as security services.  
Categories: Business Operations, Application Data Management 

Deal: A U.S.-based financial services company awarded us a three-year Minimum Revenue Commitment (MRC) deal to provide a wide range of services that will be decided each year by the client.  

Deal: A U.S.-based health insurance provider selected us to provide BPO services to help improve the user experience for their 1.2 million Medicaid members.  
Categories: Business Operations, Cloud 

Deal: A leading North American bank asked us to help them migrate their data repositories to Azure Cloud over the course of three years.  
Categories: Artificial Intelligence and Analytics, Application Data Management  

Deal: A UK-based public sector enterprise chose us to provide application delivery services for their digital delivery and National Capital and Ecosystem Assessment (NCEA) programs.  
Categories: Artificial Intelligence and Analytics, Digital Engineering, Application Data Management 

Deal: A U.S.-based provider of life insurance, annuity, and investment products tapped us to provide application support and managed services for a wide range of apps and offerings.  
Categories: Quality Engineering and Assurance, Application Data Management, Artificial Intelligence and Analytics  

Deal: A U.S. educational content, technology, and services provider renewed and expanded our existed managed capacity services deal. The scope includes app support and maintenance for their back office and commerce applications as well as infrastructure support for their internal service desk.  
Categories: Digital Engineering, Application Data Management, Cloud 

Deal: A U.S. bank holding company renewed our agreement to provide ongoing IT development and support.  
Categories: Digital Engineering, Quality Engineering and Assurance 
5 News Article
CEO blog: Watch my interview with CNBC India
CEO blog  Watch my interview with CNBC India
Interview with CNBC India
I had a great time sitting down with Shereen Bhan, managing editor at CNBC-TV18 in India, to discuss the outlook for tech, growth areas for Cognizant, India expansion and more. Watch part of our interview here. 


Cognizant Introduces Cognizant® Ocean to help ocean industries navigate the effects of over-exploitation and climate change
I am thrilled to share that today we announced Cognizant has created a new business group, Cognizant® Ocean, which will focus on helping clients in the "Blue Economy" apply digital technologies, such as AI and data analytics, to improve their business outcomes, reduce their carbon output and decarbonize the oceans.  

Cognizant Ocean aims to drive sustainability, efficiency, and growth in the Blue Economy, which encompasses a wide range of sectors that operate in and around the world's oceans, including shipping, marine transportation, offshore oil and gas, marine renewables, aquaculture, and marine conservation, among others. Check out the Be.Cognizant story to learn more. 
GGM Analyst and Advisor Summit
A terrific day learning and interacting with our friends in the analysts and advisory community in our London office!
Cognizant joins AT&T Connected Climate Initiative, commits to helping reduce one billion tons of CO2 emissions by 2035 
I'm excited to share that Cognizant is expanding its global collaboration with AT&T by joining the AT&T Connected Climate Initiative (CCI), an industry consortium dedicated to eliminating one billion tons (the Gigaton Goal) of CO2 emissions by 2035 through the use of connectivity solutions and technology.

Joining the CCI is a natural expansion of Cognizant's relationship with AT&T and represents a strong marriage of technology, expertise and a shared commitment to helping enterprises achieve net zero status while continuing to drive digital business transformation. 
Safeguarding our economy and supporting industries of the future
Recently, I had the opportunity to meet with the U.K. Prime Minister and other U.S. business leaders to discuss safeguarding our economies, strengthening our supply chains and supporting industries of the future. The UK is a very important market for Cognizant, and we see tremendous growth opportunities. Last year we delivered on our promise to open delivery centers in Leeds and Northern Ireland and just this year opened our flagship London Collaboration Hub for our Cognizant employees. As a business, we remain committed to investing in the UK and see the success of our UK business as a pivotal part of Cognizant’s growth overall.
Building the workforce of the future
I was delighted to sit down with Taranjit Singh Sandhu, Indian Ambassador to the United States. During our time we discussed the growing tech partnership between the United States and India and collaboration in skilling. Collaborations like this will be a key part in building the workforce of the future.
Crowdsourcing innovation: The Generative AI Ideation Challenge 
Recently, we announced a company-wide Generative AI Ideation Challenge powered by Bluebolt™ to tap into the creativity of our 350,000+ associates. The challenge invites you to submit your game-changing ideas on how generative AI can positively impact our organization, our clients, and our society. This challenge is open to everyone at Cognizant, so all are invited to participate. If you know someone who might be interested, encourage them to join! Check out the Generative AI Ideation Challenge page for details. 
Cognizant launches third ESG report on World Environment Day
As we celebrate World Environment Day, we launched our third ESG report – which articulates our progress across all three ESG pillars. Last year alone our teams spent more than 1,360 hours answering our client’s ESG questions, which yielded $3.8B in revenue. To help ensure you're prepared to have conversations with clients on sustainability, read the report and take our climate education training.
Why Cognizant?
At our Town Hall in May, I spoke with you about the many signs of our company’s growing momentum. At the heart, is a special culture, spirit, and sense of purpose that begins with our heritage of client-centricity and flexibility—our ability to build long-term, high-quality partnerships with our clients. Clients appreciate our humility—our willingness to listen, learn, and adapt. The longevity of our client relationships attests to the trust we’ve earned by always putting clients’ needs and success first. Today, with technology at the core of every business, clients insist on expertise at the intersection of industry and technology. From our earliest days, we were known for providing expert advice to clients on how best to apply new technologies to their industry-specific business problems. The market for tech services has moved our way. We are a standout partner at this confluence of industry and technology, with the added benefit of having a client-centric operating model. We are also the rare partner that can assist clients with their range of needs—and that includes helping them responsibly deploy generative AI.

Our work is meaningful because we’re a trusted partner to organizations that are changing the world for the better. We engineer modern businesses to improve everyday life—the everyday life of people, organizations, and society. Close to my heart is how deeply engaged we are with our communities. Now, we have a unique opportunity to apply Cognizant’s reskilling and learning infrastructure to help our communities improve human capital at scale.

We also have the opportunity to reclaim our employer-of-choice standing. That’s why our people strategy is focused on accelerating role movement, strengthening our learning and leadership programs, enabling more women to advance, fostering a more diverse and inclusive workplace, and prioritizing your well-being.

Today, I’m more convinced than ever that we have everything we need to win in the marketplace. So, when I ask myself why Cognizant, your insights have helped me realize how uniquely fit for the future our company is. We have everything we need to be a truly great and enduring company.
Celebrating Pride Month
Today, we celebrate the beginning of Pride Month — an opportunity to continue to uplift LGBTQ+ voices, celebrate LGBTQ+ culture and support LGBTQ+ rights. Read CFO Jan Siegmund's note on celebrating Pride Month to learn more about how to become an ally, and follow our social media channels – Yammer, LinkedIn, Twitter, Facebook and Instagram – to see stories throughout the month that highlight our commitment to creating a culture of inclusion. 
Tradition meets innovation: Cognizant celebrates 20 years in Switzerland 
Recently, we announced the opening of a new office in Geneva, Switzerland, coinciding with our 20th anniversary in the region. The new office, which opened this month, is a step to further enhance our consulting and service offerings for companies in French-speaking Switzerland. 
Americas Analyst and Advisor Summit 
Today, we hosted several analysts and advisors comprising some of the top customer influencers. Those in attendance got a great understanding of the work Cognizant is doing, where we're focused, and where our investments are. The energy in the room was amazing! What a great day!
Sustainability as a business strategy
I'm proud to announce Cognizant’s new study, Deep Green, to help businesses embed sustainability thinking into the core of all they do. These businesses will not only shrink their own environmental footprint and those of their stakeholders, but also, they will discover new ways to secure resilient growth. Read the report to learn more about how data, technology and collaboration will drive the next phase of sustainability in business. 
Introducing the new Be.Cognizant
Over the weekend our teams launched a new Be.Cognizant. The new website is just the first step on a path to give you a better communication experience, one that's simple, personalized and built for two-way conversation with your coworkers and leaders. Take a tour of the new site here. 
Cognizant recognized by Forbes for growing momentum in health services
Cognizant was recently recognized by Forbes for delivering technology for health sciences. This recognition is one example of how our healthcare clients are continuing to invest with Cognizant as we strengthen our value proposition at the intersection of industry domain, technology and platforms. Read the full article here. 
Cognizant launches Cognizant Neuro®? AI platform to help companies responsibly deploy generative AI at enterprise scale
I’m excited to announce that Cognizant has launched a generative AI platform – Cognizant Neuro®? AI – offering enterprises a secure, responsible, and scalable pathway to confidently navigate the complex AI landscape Cognizant. Learn more here. 
Fortune Magazine names us among the top 25 most innovative boards
I'm proud to share we have been named #19 on Fortune's Modern Board 25 list for 2023 based on criteria that include the expertise, independence, diversity, and tenure of our board membership. View the full ranking on Fortune's website.
Cognizant and Google Cloud expand alliance to bring AI to enterprise clients
Excited to be partnering with Google Cloud to accelerate the adoption of generative AI by businesses globally. Our investments in developing generative AI capabilities include launching the Cognizant Google Cloud AI University to train 25,000 Cognizant professionals and clients and opening a series of Google Cloud AI Innovation hubs in Bangalore, London, and San Francisco. Cognizant will play a critical role in supporting the global shift to responsible AI use. Learn more about our partnership here.

To share on your social channels, click the below links:
Cognizant named a leader for Intelligent Process Automation Solutions by Everest Group
I am proud to announce that Cognizant has again been named a Leader in Everest Group's Intelligent Process Automation (IPA) PEAK Matrix® 2023. This recognition reaffirms our commitment to our customers and highlights the strengths of our customer-centric approach, proprietary Neuro® suite, and adaptability. Learn more here.
Accelerating investments in Generative AI
I had the opportunity to connect with the Economic Times while in India and again after earnings last night. I’m proud of how they positioned Cognizant and what we are doing to advance our technology both inside and outside Cognizant.
Unlocking the potential of Generative AI
With Cognizant’s brand platform defined by the words “intuition engineered,” AI and automation are core to our DNA. We recently launched Neuro IT Operations, a next-generation platform that brings new levels of automation and intelligence to applications and infrastructure operations. This platform, coupled with our prior automation investments in people and tools, will provide a strong foundation from which to leverage the power of automation and AI for our clients and our entire organization.

I’m extremely excited by the potential of recent breakthroughs in Generative AI that can help us fundamentally transform our clients’ businesses while accelerating their productivity and thereby driving significant impact. I believe the impact of ChatGPT ushers in a new era in which chatbot applications will generate creative content. GitHub Co-Pilot is another example of the power of Generative AI to perform the role of “companion programmer.”

As we’ve seen with prior technology advances, these potential benefits also require attention to security, compliance, sustainability, and model biases to assure safe and responsible implementation.

Click here to learn more about the three key areas that will enable us to become the leader in AI and automation.
Announcing Cognizant Skygrade™?: A Multi-Hybrid Cloud and Edge Integrated Management Platform for Comprehensive Cloud Transformation
Excited to announce the launch of Cognizant Skygrade™?, our new multi-hybrid cloud and edge management platform. This integrated, industry-focused solution will help clients transition to modern cloud-native architectures and streamline their cloud management operations, accelerating their pace of business innovation.

Huge congratulations to our teams for developing this breakthrough platform! To learn more, click here.
Nike expands relationship with Cognizant to manage its global technology operations
Today, Cognizant announced a new agreement to transform and support the technology operations of Nike, the world's leading designer, marketer, and distributor of authentic athletic footwear, apparel, equipment, and accessories.

Building on the companies' 14-year history of collaboration, this new agreement will consolidate several of Nike's existing IT support functions with Cognizant serving Nike across 230+ locations in more than 40 countries. Cognizant will support the company's customers, partners, as well as its 70,000 employees through three key areas of technology operations: Multilingual IT Customer Service, Deskside and Dispatch Depot, as well as Application and Infrastructure Support.

This is a game-changing win for our Retail team as we expand our partnership to manage global technology operations for Nike to drive exceptional customer, partner and employee experiences by leveraging AI, hyper-automation and process re-engineering. Learn more here.
Creating a grassroots innovation movement
Innovation is not something that only a few people in our company do. The innovative drive lives within all of us. Given the scale and diversity of our global teams, we have the potential to harvest an abundance of ideas, big and small, that can contribute to our clients’ success and move our company forward.

I’m excited to announce that we’re relaunching and broadening a highly productive Continuous Improvement & Innovation (CII) program under a new name: Bluebolt, a reference to “a bolt from the blue,” meaning something important that can come from anyone or anywhere. Solving problems, looking for unmet or latent client needs, challenging the status quo, imagining a better future—these are all aspects of operating with a growth mindset.

Bluebolt will serve as Cognizant’s innovation engine, fueled by your ideas. It will leverage the CII program’s infrastructure, processes, and methods, along with resources from the bench, to help us convert ideas into working prototypes and from there seek to monetize these ideas by generating value for clients.

For more insight into what I’ve been hearing from clients and why I believe Bluebolt holds such promise for all of us, I invite you to watch my conversation with Gaurav Chand in which we talk about the power of building a grassroots innovation movement and creating a large repository of innovation assets for our clients. 
Horizon Healthcare Services selects Cognizant to support its government healthcare programs for 1.2 million members
Cognizant has been selected by Horizon Healthcare Services, Inc., New Jersey's oldest and largest health insurer, to support its government healthcare programs. As part of a 7-year renewal agreement, Cognizant will manage Horizon's claims processing, encounters submissions to the state, provider configuration, and enrollment services for its 1.2 million Medicaid and Dual Eligible Special Needs Plan (D-SNP) members.

Cognizant will leverage its TriZetto healthcare products suite to provide end-to-end support for Horizon, including hosting the insurer's operations on its Facets platform. By utilizing advanced automation solutions, Cognizant will help Horizon expedite the claims payment process and ensure accuracy in support of excellent member-provider experiences. Learn more about this exciting win for our Healthcare team here. 
Global Business Services (GBS) Finance Team named Best of the Year
I’m excited to share that our Global Business Services (GBS) Finance Team was named “Best Finance Team of the Year” and our India CFO P K Hari Hara Subramanian was named “Best CFO – IT” at the third annual India CFO Awards in Delhi.

This prestigious award focuses on finance teams at companies of varying sizes operating across industries in India. The panel of judges included the Joint Secretary, Ministry of External Affairs, Government of India, as well as the CFOs of several large Indian and multinational corporations.

Our India Finance Leadership Team was recognized for their exemplary work in areas such as people engagement, women empowerment, learning and development initiatives, hybrid work options, and outreach to our communities. PK was honored for his leadership in building a future-proof finance organization that excels at transforming financial processes for greater efficiency, developing and engaging people, driving diversity and inclusion, and promoting ESG activities.

In my view, our global Finance organization, under Jan Siegmund’s leadership, ranks among the very best in the world. Congratulations to our entire GBS Finance Team and their leaders!
FCCI modernizes claims operations through new cloud migration with Cognizant and Guidewire
Today, Cognizant and Guidewire announced the modernization of claim operations for FCCI Insurance Group (FCCI), helping the regional property and casualty insurer to reduce claims processing times and costs and allow agents to focus on improving their customer experiences. FCCI selected Cognizant for our expertise in conducting cloud migration assessments and implementing Guidewire products. With a dedicated Guidewire team, Cognizant has played a crucial role in modernizing property and casualty insurance companies' business processes and technology operations. Learn more here.
100 clients in 100 days? ?
I am thrilled to announce that today I met my commitment of meeting 100 clients within my first 100 days! I spent the day in Toronto, Canada, where I had the pleasure of meeting with two clients – both in the Retail, Consumer Goods, Travel & Hospitality (RCGTH) space. It has been so helpful to spend this time with clients, hearing directly from them what they like about Cognizant and the opportunities for us to improve. Across the board, clients have shared that we have a unique culture, one that is client-centric, and how our associates continuously go beyond the specifications of the job to make sure they're delivering for clients. Thank you for always showing up and going the extra mile. I couldn't be more excited to continue to lead this organization toward growth, becoming the employer of choice and operating with excellence across the board.
Cognizant Named a Leader in Capital Markets Operations
I'm proud to share that the independent analyst firm Everest Group recognized Cognizant as the lead player in digital operations in Capital Markets covering specialized areas like predictive analytics, ESG profiling, regulatory compliance and adapting new-age technologies like distributed ledgers. Learn more here.

To share on your social channels click the below links:
Cognizant and Boehringer Ingelheim collaborate on unified cloud platform to speed the delivery of life saving therapies
Today, Cognizant announced it is working with Boehringer Ingelheim, a leading research-driven biopharmaceutical company, to advance the speed and quality of medicinal therapy development. Leveraging the Veeva Development Cloud, Cognizant will help Boehringer Ingelheim to unify medicinal development processes and data into a connected technology ecosystem, enhancing collaboration across clinical, regulatory, and quality functions.

Learn more about this great win for our Life Sciences team.

To share on your social channels click the below links: 
Cognizant and Microsoft collaborate to bring Microsoft cloud-based technology solutions to the healthcare market

I am delighted to announce an expansion of our long-standing healthcare collaboration with Microsoft, to give healthcare payers and providers easy access to cutting-edge technology solutions, streamlined claims management, and improved interoperability to optimize business operations and deliver better patient and member experiences. Learn more.
UK Department for Environment, Food & Rural Affairs signs £74M contract with Cognizant
Today we announced Cognizant has been chosen by the UK’s Department for the Environment, Food and Rural Affairs (Defra) to support the delivery of business change and provide improved services to the government organization. The two-year contract will help Defra enhance its supply chain model under the Application Development and Maintenance Support services program. Learn more about this great win for our U.K. team.
Cognizant named a top provider of healthcare cloud-based administrations
I am excited to announce that Cognizant has been recognized as a Leader in healthcare cloud-based core administration by analyst Everest Group. In its review of 14 IT healthcare service providers, Everest Group recognized Cognizant’s TriZetto practice as a Leader for its extensive portfolio of services, strong vertical and technical capabilities, and positive client feedback. To learn more, click here. You can also share the news on your social channels by leveraging the below links.

Empowering businesses to run themselves through AI-led IT operations
I am excited to announce that Cognizant’s new Neuro IT Operations platform puts AI-powered automation at the center of IT operations and enables clients to succeed in the next wave of digital transformation. Enterprises with large and ever-growing technology estates are often faced with increasing run costs and high demands on talent to keep IT operations running effectively. As risks to service availability and uptime increase, there’s little room to focus on what truly drives business value – innovation. This a defining challenge across industries that requires fresh thinking to solve, and Cognizant is committed to doing just that for our clients using a combination of state-of-the-art technology, complemented by Cognizant’s human expertise. Read the full article here and see below for a list of resources. 

Cognizant launches climate education
Today we launched our climate education training for all associates. I’m particularly excited about this training as I know our clients want to have important climate conversations. This training raises our awareness and prepares us to have those critical conversations. Combatting climate change requires digital transformation; as digital transformation experts, we must lead our clients in this space.

Take the Great Climate System course today – it only takes an hour.
Cognizant secures two coveted D&I awards
Congratulations to the entire Diversity & Inclusion team, which recently received two World 50 I&D Impact Awards: I&D Team of the Year and our very own Shameka Young was honored with the I&D Leader of the Year Award. The World 50 I&D Impact Awards spotlight the incredible strides organizations have made to turn diversity & inclusion strategy into measurable and lasting impact. The award recipients were selected by a panel of independent judges.

I am extremely proud of the progress we are making in this space and look forward to working together as we continue to advance and enhance our diversity profiles.

Video link: I&D Impact Awards 2023: I&D Team of the Year Winner (vimeo.com)
Cognizant named one of America's Most Innovative Companies by Fortune
I’m excited to announce that Cognizant has been named one of America's Most Innovative Companies 2023 by Fortune and Statista (the world-leading industry ranking provider). We join 300 companies selected for “transforming industries from the inside out.”

Cognizant is ranked 64 out of 300 and joins a technology category that includes Microsoft, Oracle, IBM, Dell, and Apple, among others. Companies were evaluated on their product and services innovation, process innovation, and innovation culture, which measures how a company fosters a spirit of entrepreneurship and creativity and enables teams to implement new ideas. We should all be proud of this recognition. You can find America’s Most Innovative Companies list here.

Caliber 2023 kickoff
I was delighted to have a fireside chat with Joerose Tharakan, Director of Partner Development at Microsoft, on the strategic partnership between Cognizant and Microsoft, the future of the tech services industry, and upskilling in the "age of AI." What a great way to kick off Caliber 2023 — a joint yearly enablement effort to target consultants across the globe eager to learn and get certified on Microsoft Cloud technologies, driven in part by Microsoft and Cognizant Learning and Development.

Connecting with associates in San Francisco
It was great to catch up with clients and our amazing teams in the Bay Area this week! 

UK&I Fireside Chat 
What a wonderful time in London! I was thrilled to engage with associates during our fireside chat with SVP and UK&I Head Rohit Gupta. Thank you for your hospitality.

Simplifying the business for a growth mindset
Today we announced an organizational change to help simplify the company’s objectives, operations and organizational structure. This change begins with the company’s performance objectives, which we’ve consolidated to three interrelated business imperatives that, when executed, will produce a self-reinforcing virtuous cycle. These objectives are 1) accelerating commercial momentum for growth, 2) becoming the employer of choice in our industry, and 3) simplifying our operations. I encourage you to read the full announcement on Be.Cognizant to learn more about the recent org change which will bring us closer to our clients and associates.
Forbes Magazine names Cognizant Consulting one of America’s Best Management Consulting Firms
I'm delighted to announce that Cognizant Consulting has been recognized by Forbes as one of America’s Best Management Consulting Firms in 2023. This accolade reinforces Cognizant Consulting’s reputation for excellence in developing solutions from an engineering perspective, as well as through a business and technology lens. Our expertise can be seen across multiple industries, including, automating point-of-sale data in the media industry, accelerating pharma market share analytics, and improving healthcare operations and decision-making. Learn more here.
AWS names Cognizant a Travel and Hospitality Consulting Competency Partner
I'm proud to share that Cognizant has achieved Amazon Web Services (AWS) Travel and Hospitality Consulting Competency status for its ability to deliver services and solutions leveraging AWS technologies. The Competency program recognizes Cognizant’s capabilities and expertise to design and implement cloud, digital transformation, revenue management, customer engagement, Point-of-Sale, and reservation system solutions. These solutions improve a client’s ability to deliver a better experience for customers while delivering more cost-efficient operations. Learn more about this achievement here.
Building relationships to strengthen ESG and workforce skilling
Over the last two days, I had the pleasure of meeting with state representatives and CEOs at Business Roundtable. I sat in on discussions like how the landscape for ESG and corporate sustainability investments has evolved, and learned more about the group's education and workforce policy initiatives. I'm excited to continue the conversation to discuss how businesses can partner with state executives on workforce development to help advance apprenticeship programs, workforce-driven immigration reform and more.
Cognizant recognized as a Market Leader in Automation Services by HFS Research
I'm thrilled to share that Cognizant has been named a Horizon 3 Market Leader in Automation Services by independent analyst firm HFS Research (HFS). Companies recognized as a Horizon 3 Market Leader have distinct capabilities to drive synergies and new sources of value across client organizations, in addition to the cost reductions, productivity improvements, and improved experiences that Horizon 1 and 2 vendors can provide. The HFS report highlights Cognizant's Automation practice, its industry orientation, and its customer-centric approach as essential to its success. Learn more here.
Cognizant engaged by Volkswagen Group Ireland to transform its digital customer experience
So excited to announce that Cognizant has been selected by Volkswagen Group Ireland — the multinational automotive manufacturer headquartered in Wolfsburg, Germany — to transform its digital customer service landscape. Cognizant will also provide VWG Ireland with advanced insights into customer journeys and conversations. This is intended to improve reporting, advance business decisions, and drive next best actions to provide a personalized experience to customers and recommend next steps, services or products. In addition, Cognizant will work together with VWG Ireland for continuous improvement, feature enhancements and process innovation of the CX platform. This move will enable VWG Ireland to unify its legacy contact center functionalities, streamline its customer service to reduce maintenance costs and improve efficiency, while gaining a holistic customer 360-degree view. Learn more here. 
Reflections from India: Cognizant Outreach is changing people's lives
I’m recently back from my first visit to India as CEO, where I listened to and learned from thousands of our associates in several cities across the country while also engaging with clients, virtually and in person. The one thing that stood out were the inspiring stories of people from underserved communities who have been mentored, skilled, and trained by volunteers of Cognizant’s Outreach program. The passion and generosity of our associate volunteers who have dedicated more than 150,000 hours over the past year to help transform lives in local communities reaffirms my belief that businesses are the biggest platforms for societal change.  I met school children who were able to access online learning through laptops and devices donated by Cognizant, students from economically weaker sections who were coached from class 9th onwards to reach their goals of getting into top tier engineering colleges, young women from rural areas of India whom our volunteers upskilled for technology jobs…hearing these and more stories of people overcoming extraordinary hardships and changing their future with support from our volunteers was priceless. Thanks to all our Outreach volunteers and leaders globally for their incredible work and for making volunteerism a unique differentiator at Cognizant.

See more photos on my LinkedIn post and leave a comment to let me know how you've improved people's lives through Outreach, no matter where you are in the world. 
Cognizant plans to open a new office in Malaysia and increase its workforce to 5000 by 2026
I'm excited to share that Cognizant announced its new office in Kuala Lumpur, Malaysia will open by the end of Q2 2023 and increase its workforce to 5,000 within the next three years. The new office comprises of a Centre of Excellence (CoE) and 17 offshore development centers (ODCs). This investment in Cognizant Malaysia validates the critical role it plays in Cognizant’s global delivery network and growing suite of services that support clients from a range of sectors in their digitalization journey. 
Celebrating International Women's Day
Today, I had the opportunity to connect with our women in Coimbatore, one of our sites in India with our highest gender diversity (49% women).

Listen to my discussion with CPO Becky Schmitt where we discuss the desired associate experience regarding gender equity, and answer some of your pre-submitted questions.

Also, be sure to check out the International Women's Day microsite for a full list of events happening across the organization throughout the month.
Engaging with associates in Bangalore
What an exciting day in Bangalore! The buzzing site has such diverse representation across industries and service lines! Thank you for your warm welcome and your engagement during our town hall. 
Engaging with associates in Pune
I'm thrilled to continue my listening tour with a trip to Pune. The vibrant energy reminded me of our entrepreneurial spirit, bold ambitions and strong camaraderie.
Connecting with associates in Hyderabad
What an energizing day in Hyderabad, a city that is very special to me. I lived there until 2014 when I moved to the United States. Today’s town hall was packed with smiling faces and a sense of excitement filled the air. While I spent the day in Hyderabad, we had two other teams visit Kochi and Bangalore. Rajesh hosted the local team in Kochi and Surya met with the team in Bangalore. I’m looking forward to visiting both cities next week and meeting the teams. It’s so energizing to be back in India wearing the Cognizant brand. Thank you for the warm welcome.
Connecting with associates in Chennai
Today, I had the opportunity to engage with more than 1,000 associates in Chennai. I enjoyed answering your questions and getting to know what’s on your mind. I look forward to continuing my listening tour to help us become our industry’s employer of choice.
DSB selects Cognizant as sole offshore supplier of IT consulting services
Today we announced that DSB, Denmark’s state railway operator, has selected Cognizant as the sole provider of offshore IT consulting services to accelerate, scale and further improve its ability to deliver against its digital strategy.

The multi-year agreement is aimed at extending DSB’s data analytics, IoT and software development capabilities to better manage and plan availability of trains, have a better understanding of peak demand for services, gain insights into passenger sentiments, and enable predictive maintenance of its fleet. Congratulations to the team!
Cognizant brings Data Intelligence Toolkit to Snowflake’s Telecom Data Cloud
I'm proud to share that Cognizant recently announced the launch of our Data Intelligence Toolkit as a pre-built solution for the Telecom Data Cloud, launched by Snowflake, the Data Cloud company. The Telecom Data Cloud unites Snowflake’s platform, Snowflake-and-partner-delivered solutions, and industry-specific datasets.

The Telecom Data Cloud is designed to help telecommunications service providers accelerate digital transformation for the Telecom industry, enable superior customer experiences, maximize operational efficiency, and monetize new data services. Learn more here.
Our purpose in action: Making a lasting impact on healthcare in Africa
In partnership with GSK, one of our key Life Sciences clients, Cognizant collaborated with Africa’s leading health charity, Amref Health Africa, to address the shortage of skilled healthcare workers, sustainably strengthen healthcare systems and increase access to life-saving care through digital transformation. Our multitalented Cognizant team, led by Sathish Manickam, Chief Architect, took on the challenge to develop an integrated, user-friendly and cost-effective platform to help Amref identify training requirements, greatly improve planning and resource allocation and enable more data-driven decision-making. The team spent more than 5,000 hours working with Amref to develop the “single pane of glass” platform, which is already helping to improve the quality of service healthcare workers provide through better visibility of training requirements and enhanced training programs. Click here to read the full story.
Cognizant supports relief efforts in Turkey and Syria
We have all seen the headlines of the horrible earthquake that resulted in utter devastation and widespread suffering across Turkey and Syria earlier this month. Many of our associates have friends and family in this region and as a community of more than 355,000 associates, we want to show our commitment and support for those that have lost loved ones due to this tragedy. I’m pleased to share that Cognizant has donated $150,000 to support relief efforts in the region, including UNICEF USA, World Central Kitchen and the Turkish Red Crescent (the Red Cross affiliate in the region). If you are looking to support local relief efforts we encourage you to support organizations at the local level to make the most impact and reduce any delay. We are keeping this region in our thoughts and prayers as rescue efforts strive to find those who may still be alive and these communities begin their efforts to recover from this disaster.
Business leaders and governors discuss workforce opportunities
Pictured from left to right: Greg Gianforte, Governor of Montana; Brad Smith, Microsoft Vice Chair and President; Ravi Kumar S, CEO of Cognizant; Jennifer Aument, AECOM Transportation Chief Executive.

In a recent panel conversation, I, along with Microsoft Vice Chair and President Brad Smith, and AECOM Transportation Chief Executive Jennifer Aument, had the pleasure of talking to New Jersey Governor Phil Murphy and Montana Governor Greg Gianforte about strategies – including broadband access, digital skills training and apprenticeship programs – to address workforce shortages and ensure workers have the skills required to succeed in a changing job market. I was proud to share Cognizant's commitment to build a strong and vibrant U.S. workforce: "We’ve dedicated $150 million to support education and STEM skills development, and sponsored the [National Governors Association's] Workforce Innovation Network to support states in creating broader digital access. We’ve seen the benefits of private-public partnerships and appreciate NGA gathering us to exchange innovative solutions. Since the U.S. is one of Cognizant’s principal markets, we’re just as committed to investing millions of dollars in our employees’ continuous training, hiring from schools around the country, and upskilling across a range of digital skills."
Connecting with associates around the world
Yesterday, I accomplished one of my main goals: to have the opportunity to speak with all 350,000 associates. I enjoyed answering your questions and getting to know what’s on your mind. If you missed our first all-associate town halls, be sure to view the first and second sessions.
My prediction for 2023
The Wall Street Journal asked business leaders what they see on the horizon. I was humbled to have my viewpoint included: “We see a strong push now to bring AI into business landscapes with the expectation that AI will re-engineer enterprises as completely as enterprise software did three decades ago. Of course, as clients navigate a challenging macro environment now, they need to fund their investments in digital transformation by executing cost and efficiency agendas.”
Knowledge is power
I knew it from the outside and now I’m seeing it from the inside: Our expertise runs deep. Just look at the deal we just announced to help Orica achieve their Net Zero goals. Orica will tap into both our digital and Environmental, Social, Governance (ESG) skills to accelerate development of a platform to report greenhouse gas emissions. Congratulations to the team in Australia on landing this deal!
Cognizant recognized as a leader in 17 analyst reports
In recognition of your expertise, industry analysts named Cognizant a technology leader across industries in 17 analyst reports in Q4. In 2022, we were recognized by industry analysts in 53 different categories. View the Be.Cognizant article to see the reports and visit Linkedin and Twitter to like and share.
Earnings ? Client Visits ????
Pictured from left to right: Annie Lai, Director, Investor Relations; Ravi Kumar S, CEO; Tyler Scott, VP, Investor Relations; Jan Siegmund, CFO. 

My first earnings with Cognizant is in the books and I added four additional clients to the ticker. It’s great to hear what’s on our clients' minds and how we can help.
Behind the scenes with Meera
I really enjoyed my time connecting with Meera Krishnamurthy, our leader for the Banking & Financial Service business unit. Feel free to listen in on our conversation!
In the office with purpose
On Monday, the UK team opened their doors to the new UK headquarters, located at 280 Bishopgate in the heart of London. Not only is it a great location, but it embodies our focus on bringing the ideals of ESG to the lives and wellbeing of our associates, all while meeting the highest levels of energy efficiency. Congratulations team!
Preparing for earnings
This week I’ve spent a lot of time with our incredible Finance and Investor Relations team. We’re preparing to report our Q4/full year earnings next Thursday.
Our clients want a partner, and digitization and automation are on their minds
In my first 13 days with Cognizant, I’ve met with five clients. While from very different industries - public sector, banking & financial services, retail – they shared a lot of the same sentiments. They are looking for a partner, not just an IT service provider, that offers them unique insights and a point of view on what they can do to improve their operations. They also emphasized the importance of digitization and automation. It was great to know we are on the same page!
Listening and learning
Over recent days I’ve met about 1,000 client-facing associates who attended the recent Cognizant Growth Summit in Abu Dhabi. I’ve been listening to understand more about Cognizant’s unique culture and how we can collectively become our industry’s employer of choice.
The journey begins -- join me
Within my first few days with Cognizant, I made a public commitment to do everything possible to meet at least 100 clients in my first 100 days, along with all associates. I want to bring you along on my journey and share insights from these connects. Along the way, I will keep you abreast of my progress each week, all the way through to my 100th day – April 24. I started this journey by meeting the Cognizant Executive Leadership Team.
I’m honored and humbled to join this great company 
