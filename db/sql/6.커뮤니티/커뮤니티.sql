use community;

# 공지 커뮤니티 1페이지에 등록된 게시글 목록을 조회하는 쿼리
select * from board where bo_co_num = (select co_num from community where co_name='공지');
# 3번 게시글을 상세 조회하는 쿼리	b0_num(게시글 번호)
select * from board where bo_num = 3;

# abc123회원이 3번 게시글에 '확인했습니다' 라고 댓글을 달았을 때 쿼리
select * from board;
select * from comment;

insert into comment(cm_bo_num,cm_me_id,cm_content) values(3,'abc123','확인했습니다.');

# 3번 게시글에 등록된 댓글 1페이지를 조회하는 쿼리
select * from board join comment on cm_bo_num=bo_num where bo_num=3 limit 0,1;

#admin 1번 댓글을 '기타로' 신고
insert into report(rp_me_id,rp_rt_name,rp_table,rp_content,rp_state,rp_target)
values('admin','기타', 'comment', '','신고접수', 1);

select * from report where rp_state='신고접수';

