package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import java.util.*; //모든 유틸안에 클래스가 임포트됌.하위패키지는 제외.
public class ScoreDao {
	Map<String, List<ScoreVo>> map;

	public ScoreDao(Map<String, List<ScoreVo>> map) {
		this.map = map;
	}

	public boolean insert(ScoreVo vo) { //입력
		boolean b = true;
		try {
			String key = vo.getSno();
			if (map.containsKey(key)) {// containsKey 키가 존재하는지 확인
				List<ScoreVo> list = map.get(key);
				list.add(vo);

			} else {// 키가 없는경우
				List<ScoreVo> list = new ArrayList<ScoreVo>();
				list.add(vo);

				map.put(key, list);
			}
		} catch (Exception ex) {
			b = false;
		}
		return b;
	}

	public boolean update(String key, int index ,ScoreVo vo) { //수정 
		boolean b =true;
		
		try {
			List<ScoreVo> list = map.get(key);//키값
			list.set(index, vo);
			
		}catch(Exception ex) {
			b =false;
		}
		return b;
	}

	public boolean delete(String sno, int index) { //삭제
		
		boolean b = true;
		
		try {
			List<ScoreVo> list = map.get(sno);
			list.remove(index);
		}catch(Exception ex) {
			b = false;
		}
		
		return b;
		
		
	}

	public Map<String, List<ScoreVo>> list(String findStr) { // 리스트를 부른 결과가 맵의 st,list같은 타입이다
		Map<String, List<ScoreVo>> newmap = new HashMap<String, List<ScoreVo>>();

		Set<String> set = map.keySet();// 키값 비교
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			if (key.indexOf(findStr) >= 0) {
				newmap.put(key, map.get(key)); //
			}
		}

		return newmap;
	}
}
