use community;

# 공지 커뮤니티 1페이지에 등록된 게시글 목록을 조회하는 쿼리
select * from board where bo_co_num = (select co_num from community where co_name='공지');
# 3번 게시글을 상세 조회하는 쿼리
select * from board where bo_num = 3;
