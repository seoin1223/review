package multi.backend.project.review.reviewVO;

import lombok.Data;

@Data
public class reviewVO {
    private int review_id; // 글 번호
    private String user_id ; // 작성자 id 
    private String review_title; // 제목
    private String  review_content; // 내용
    private String create_date; // 작성일
    private String update_date; // 수정일
    private int review_views; // 조회수
    private int review_recommends; // 추천수


}
