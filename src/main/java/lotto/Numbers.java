package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Numbers {

	public List<Integer> generateLottoNumbers() {
		return Randoms.pickUniqueNumbersInRange(1, 45, 6);
	}
}
