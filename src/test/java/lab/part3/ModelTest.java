package lab.part3;

import com.githab.eefimova.part3.BrokianUltraCricket;
import com.githab.eefimova.part3.HyperintelligentCreature;
import com.githab.eefimova.part3.Issue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ModelTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void test() {
        HyperintelligentCreature creature = new HyperintelligentCreature(100);
        creature.disputeAboutMeaningOfLife();
        assertTrue(creature.tiredOfArguing());
        BrokianUltraCricket game = new BrokianUltraCricket();
        creature.playTheGame(game);
        game.hit();
        game.runAway();
        creature.sitDownAndSolveIssue(new Issue("все вопросы раз и навсегда"));
        assertTrue(creature.haveAllIssuesBeenResolved());
    }
}
