package dk.sdu.mmmi.cbse.playersystem;

import dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;
import org.junit.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PlayerPluginTest {

    @Test
    public void testImplementsIEntityProcessingService() {
        Class<?> playerPluginClass = PlayerPlugin.class;

        assertTrue("PlayerPlugin should implement IEntityProcessingService",
                IGamePluginService.class.isAssignableFrom(playerPluginClass));
    }
}
