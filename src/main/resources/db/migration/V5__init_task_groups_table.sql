    create table task_groups
    (
        id int primary key auto_increment,
        description varchar(100) not null,
        done bit,
        deadline datetime
    );
    alter table task_groups add column audit_createdOn datetime null;
    alter table task_groups add column audit_updatedOn datetime null;
    alter table tasks add column task_group_id int null;
    alter table tasks add foreign key (task_group_id) references task_groups (id);