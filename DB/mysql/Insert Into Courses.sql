# You need to change first 3 inputs (course_id, course_name, course_pre_id)
##################
# LEVEL 1        #
##################
#------------------
# Level 1 term 1
#------------------
insert ignore into courses values ('CS11','computer ignore intoduction',null,'GR',1,1);
insert ignore into courses values ('CS110','semiconductors',null,'GR',1,1);
insert ignore into courses values ('OD111','discrete mathematic',null,'GR',1,1);
insert ignore into courses values ('MA111','mathmatics1',null,'GR',1,1);
insert ignore into courses values ('CS131','fundamentals of programming',null,'GR',1,1);
insert ignore into courses values ('GN170','scientific&technical report writing',null,'GR',1,1);

#------------------
# Level 1 term 2
#------------------
insert ignore into courses values ('IS111','introduction to IS',null,'GR',1,2);
insert ignore into courses values ('GN112','Fundamentals of Management',null,'GR',1,2);
insert ignore into courses values ('HM110','Human Rights',null,'GR',1,2);
insert ignore into courses values ('GN140','professional Ethics',null,'GR',1,2);
insert ignore into courses values ('GN160','Quality',null,'GR',1,2);
insert ignore into courses values ('GN180','Creative Thinking and Problem Solving',null,'GR',1,2);

##################
# LEVEL 2        #
##################
#------------------
# Level 2 term 1
 #------------------
insert ignore into courses values ('CS212','Data Structure','CS131','GR',2,1);
insert ignore into courses values ('OD213','introduction to Operation&Decision Support','MA112','GR',2,1);
insert ignore into courses values ('IS212','Systems Analysis & Design1','IS111','GR',2,1);
insert ignore into courses values ('IS251','Web Design and Development','CS131','GR',2,1);
insert ignore into courses values ('ST291','Statistical Methods','ST190','GR',2,1);
insert ignore into courses values ('IT261','Multimedia1','CS131','GR',2,1);

#------------------
# Level 2 term 2
#------------------
insert ignore into courses values ('IT181','Logic Design1','CS110','GR',2,2);
insert ignore into courses values ('MA112','Mathematics2','MA111','GR',2,2);
insert ignore into courses values ('ST190','Statistics&Probabilities','MA111','GR',2,2);
insert ignore into courses values ('CS132','Computer Programming1','CS131','GR',2,2);
insert ignore into courses values ('OD342','Simulation Modeling','OD213','GR',2,2);
insert ignore into courses values ('IT211','Computer Networks1','IT181','GR',2,2);

##################
# LEVEL 3        #
##################
#------------------
# Level 3 term 1
#------------------
insert ignore into courses values ('CS251','Software Engineering1','CS233','GR',3,1);
insert ignore into courses values ('IS221','Database Systems1','CS212 ','GR',3,1);
insert ignore into courses values ('CS233','Computer Programming2','CS132','GR',3,1);
insert ignore into courses values ('CS433','Cloud Computing','CS261','GR',3,1);
# 2 Courses For CS 
insert ignore into courses values ('CS321','Artificial Intelligence','CS233','CS',3,1);
insert ignore into courses values ('CS362','Operating Systems-2','CS261','CS',3,1);
# 2 Courses For IT 
insert ignore into courses values ('IT486','Digital Signal Systems','IT312','IT',3,1);
insert ignore into courses values ('IT312','Computer Networks-2','IT211','IT',3,1);
# 2 Courses For IS 
insert ignore into courses values ('IS449','Enterprise Architecture','IS111','IS',3,1);
insert ignore into courses values ('CS313','.Analysis and Design of Algorithms','IS212','IS',3,1);

#------------------
# Level 3 term 2
#------------------
insert ignore into courses values ('IS324','Database Application Programming','IS221','GR',3,2);
insert ignore into courses values ('CS352','Software Engineering2','CS251','GR',3,2);
insert ignore into courses values ('CS471','Compiler Design','CS334','GR',3,2);
insert ignore into courses values ('CS485','Selected Topics in CS3','CS334','GR',3,2);
# 2 Courses For CS 
insert ignore into courses values ('GN170','Scientific & Technical Report Writing',null,'CS',3,2);
insert ignore into courses values ('GN170','Scientific & Technical Report Writing',null,'CS',3,2);
# 2 Courses For IT 
insert ignore into courses values ('IT313','Computer Networks3','IT312','IT',3,2);
insert ignore into courses values ('IT321','Image Processing1','IT371','IT',3,2);
# 2 Courses For IS 
insert ignore into courses values ('IS355','Information Retrieval','IS221','IS',3,2);
insert ignore into courses values ('IS375','Web Information Systems','IS251','IS',3,2);

##################
# LEVEL 4        #
##################
#------------------
# Level 4 term 1
#------------------
insert ignore into courses values ('CS473','Human Computer Interaction','CS334','GR',4,1);
insert ignore into courses values ('CS474','Computer Arabization','CS334','GR',4,1);
insert ignore into courses values ('CS443','Parallel Programming','CS334','GR',4,1);
insert ignore into courses values ('CS415','Computer Security','IT211','GR',4,1);
# 2 Courses For CS 
insert ignore into courses values ('CS424','Knowledge Based Systems','CS321','CS',4,1);
insert ignore into courses values ('CS323','Machine learning','CS321','CS',4,1);
# 2 Courses For IT 
insert ignore into courses values ('IT487','Information Technology Applications',null,'',4,1);
insert ignore into courses values ('IT362','Multimedia2',null,'IT',4,1);
# 2 Courses For IS 
insert ignore into courses values ('IS331','Business Intelligence','IS322','IS',4,1);
insert ignore into courses values ('IS463','Information Security','MA112','IS',4,1);

#------------------
# Level 4 term 4
#------------------
insert ignore into courses values ('CS232','File Organization and Processing','CS212','GR',4,2);
insert ignore into courses values ('CS336','Microprocessors and Assembly language','IT181','GR',4,2);
insert ignore into courses values ('CS314','Formal Languages and Automata Theory','CS233','GR',4,2);
insert ignore into courses values ('CS341','Internet Computing','CS233','GR',4,2);
# 2 Courses For CS 
insert ignore into courses values ('CS442','Distributed Systems','CS362','CS',4,2);
insert ignore into courses values ('CS463','Embedded Systems','CS362','CS',4,2);
# 2 Courses For IT 
insert ignore into courses values ('IT444','Virtual Reality1','IT341','IT',4,2);
insert ignore into courses values ('IT416','Wireless and Mobile Networks','IT312','IT',4,2);
# 2 Courses For IS 
insert ignore into courses values ('IS343','IS Strategy, Management & Acquisition','IS111','IS',4,2);
insert ignore into courses values ('IS371','Multimedia IS & Digital Libraries','IT261','IS',4,2);