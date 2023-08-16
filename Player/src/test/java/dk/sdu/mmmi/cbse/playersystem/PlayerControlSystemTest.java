package dk.sdu.mmmi.cbse.playersystem;

import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import org.junit.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PlayerControlSystemTest {

    @Test
    public void testImplementsIEntityProcessingService() {
        Class<?> playerControlSystemClass = PlayerControlSystem.class;

        assertTrue("PlayerPlugin should implement IEntityProcessingService",
                IEntityProcessingService.class.isAssignableFrom(playerControlSystemClass));
    }
}
