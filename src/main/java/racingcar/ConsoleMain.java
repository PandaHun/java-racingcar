package racingcar;

import racingcar.domain.Race;
import racingcar.view.console.RacingGameInput;
import racingcar.view.console.RacingGameOutput;

public class ConsoleMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        String[] carNames = RacingGameInput.takeCarNames();
        int numberOfTimes = RacingGameInput.takeNumberOfTimes();

        Race race = new Race(carNames);

        for (int i = 0; i < numberOfTimes; i++) {
            RacingGameOutput.showRaceOf(race.play().clone());
        }

        RacingGameOutput.showWinners(race.getWinners());
    }

}