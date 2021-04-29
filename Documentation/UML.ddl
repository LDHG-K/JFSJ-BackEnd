
CREATE TABLE Users (user_id float4 NOT NULL, user_name varchar(50) NOT NULL, user_cration_date date NOT NULL, user_edit_date date NOT NULL, PRIMARY KEY (user_id));
CREATE TABLE Events (event_id float4 NOT NULL, id_creator float4 NOT NULL, event_name varchar(50), event_date date, event_description date, event_creation_date date, event_edit_date date, PRIMARY KEY (event_id));
CREATE TABLE Assistances (user_id float4 NOT NULL, event_id float4 NOT NULL);
ALTER TABLE Assistances ADD CONSTRAINT FKAssistance95692 FOREIGN KEY (user_id) REFERENCES Users (user_id);
ALTER TABLE Assistances ADD CONSTRAINT FKAssistance890719 FOREIGN KEY (event_id) REFERENCES Events (event_id);
ALTER TABLE Events ADD CONSTRAINT FKEvents310518 FOREIGN KEY (id_creator) REFERENCES Users (user_id);
