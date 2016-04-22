/*All User's are stored in APP_USER table*/
create table APP_USER (
   id BIGINT NOT NULL AUTO_INCREMENT,
   sso_id VARCHAR(30) NOT NULL,
   password VARCHAR(100) NOT NULL,
   first_name VARCHAR(30) NOT NULL,
   last_name  VARCHAR(30) NOT NULL,
   email VARCHAR(30) NOT NULL,
   state VARCHAR(30) NOT NULL,  
   PRIMARY KEY (id),
   UNIQUE (sso_id)
);
  
/* USER_PROFILE table contains all possible roles */
create table USER_PROFILE(
   id BIGINT NOT NULL AUTO_INCREMENT,
   type VARCHAR(30) NOT NULL,
   PRIMARY KEY (id),
   UNIQUE (type)
);
  
/* JOIN TABLE for MANY-TO-MANY relationship*/ 
CREATE TABLE APP_USER_USER_PROFILE (
    user_id BIGINT NOT NULL,
    user_profile_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, user_profile_id),
    CONSTRAINT FK_APP_USER FOREIGN KEY (user_id) REFERENCES APP_USER (id),
    CONSTRAINT FK_USER_PROFILE FOREIGN KEY (user_profile_id) REFERENCES USER_PROFILE (id)
);
 
/* Populate USER_PROFILE Table */
INSERT INTO USER_PROFILE(type)
VALUES ('USER');
 
INSERT INTO USER_PROFILE(type)
VALUES ('ADMIN');
 
INSERT INTO USER_PROFILE(type)
VALUES ('DBA');
 
/* Populate APP_USER Table */
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('user1','user1', 'User1','lastName1','user1@xyz.com', 'Active');
 
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('user2','user2', 'User2','lastName2','user2@xyz.com', 'Active');
 
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('user3','user3', 'User3','lastName3','user3@xyz.com', 'Active');
 
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('user4','user4', 'User4','lastName4','user4@xyz.com', 'Active');
 
INSERT INTO APP_USER(sso_id, password, first_name, last_name, email, state)
VALUES ('user5','user5', 'User5','lastName5','user5@xyz.com', 'Active');
 
/* Populate JOIN Table */
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile  
  where user.sso_id='user1' and profile.type='USER';
 
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id='user2' and profile.type='USER';
 
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id='user3' and profile.type='ADMIN';
 
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile
  where user.sso_id='user4' and profile.type='DBA';
 
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile  
  where user.sso_id='user5' and profile.type='ADMIN';
 
INSERT INTO APP_USER_USER_PROFILE (user_id, user_profile_id)
  SELECT user.id, profile.id FROM app_user user, user_profile profile  
  where user.sso_id='user5' and profile.type='DBA';