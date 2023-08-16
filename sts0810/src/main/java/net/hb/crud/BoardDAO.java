package net.hb.crud;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.mybatis.spring.SqlSessionTemplate; //dao-context.xml���� �Ǹ������� bean����ȭ
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
		System.out.println("\ndao �Ѿ�� �̸� = " + dto.getName());
		System.out.println("dao �Ѿ�� ���� = " + dto.getTitle());
		System.out.println("dao �Ѿ�� ���� = " + dto.getContent());
		System.out.println("dao �Ѿ�� ���� = " + dto.getGender());
		System.out.println("dao �Ѿ�� ��� = " + dto.getHobby());
		System.out.println("dao �Ѿ�� ������¥ = "+ dto.getImg_file_name());
		temp.insert("board.add", dto); 
*/