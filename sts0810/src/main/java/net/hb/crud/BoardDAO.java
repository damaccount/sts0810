package net.hb.crud;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.mybatis.spring.SqlSessionTemplate; //dao-context.xml문서 맨마지막에 bean명시화
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Repository
public class BoardDAO  implements BoardDAOImp{

	@Autowired
	SqlSessionTemplate temp;
	//SqlSessionTemplate temp = new SqlSessionTemplate();
	
	@Override
	public void boardInsert(BoardDTO dto) {
		temp.insert("board.add", dto); 
	}//end

	@Override
	public int boardCount() {	
	  return temp.selectOne("board.countAll");
	}//end

	
	@Override
	public List<BoardDTO>  boardSelect() {
		List<BoardDTO> list = temp.selectList("board.selectAll") ;
		return list;
	}//end

	
	@Override
	public void boardDetail(int data) {
		
	}//end

	@Override
	public void boardDelete(int data) {
		
	}//end

	@Override
	public void boardEdit() {
		
	}//end

}// class END


/*
		System.out.println("\ndao 넘어온 이름 = " + dto.getName());
		System.out.println("dao 넘어온 제목 = " + dto.getTitle());
		System.out.println("dao 넘어온 내용 = " + dto.getContent());
		System.out.println("dao 넘어온 성별 = " + dto.getGender());
		System.out.println("dao 넘어온 취미 = " + dto.getHobby());
		System.out.println("dao 넘어온 파일진짜 = "+ dto.getImg_file_name());
		temp.insert("board.add", dto); 
*/