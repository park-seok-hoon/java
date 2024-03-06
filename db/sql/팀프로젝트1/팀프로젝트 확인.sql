use team_2_board;


select * from member;
select * from post_category;
select * from board;

select * from member;
select * from post;
select * from board join board_category join post_category on bo_bc_num=bc_num and 
pc_bo_num=bo_num;

#사용자 추가
insert into member values('user','user','user@naver.com',24,'12345-6789','user');
insert into member values('user1','user1','user@naver.com',24,'12345-6789','user');
insert into member values('user2','user2','user@naver.com',24,'12345-6789','user');
insert into member values('user3','user3','user@naver.com',24,'12345-6789','user');
insert into member values('user4','user4','user@naver.com',24,'12345-6789','user');

select * from member;
insert into post_category values(null,'1번',null);
insert into post_category values(null,'2번',null);
insert into post_category values(null,'3번',null);
insert into post_category values(null,'4번',null);

insert into board values(null,'게시판1번','게시판',null);
insert into board values(null,'게시판2번','게시판',null);
insert into board values(null,'게시판3번','게시판',null);
insert into board values(null,'게시판4번','게시판',null);

select * from post_category;
select * from member;
select * from board;

insert into post(po_title,po_content,po_mb_id,po_bo_num,po_pc_num)
values('테스트','테스트','user1',1,1);

select * from post;

select * from post;
update post set po_title=2 where po_num=1;




