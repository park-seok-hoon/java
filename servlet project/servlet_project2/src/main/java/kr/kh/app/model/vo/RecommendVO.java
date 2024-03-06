package kr.kh.app.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RecommendVO {
	int re_num;
	String re_me_id; 
	int re_bo_num; 
	int re_state;
	
	public RecommendVO(String re_me_id, int re_bo_num) {
		this.re_me_id = re_me_id;
		this.re_bo_num = re_bo_num;
	}
}
