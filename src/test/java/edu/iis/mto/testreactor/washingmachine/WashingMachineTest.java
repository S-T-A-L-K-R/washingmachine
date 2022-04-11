package edu.iis.mto.testreactor.washingmachine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WashingMachineTest {

    @Mock
    private DirtDetector dirtDetector;
    @Mock
    private Engine engine;
    @Mock
    private WaterPump waterPump;
    private WashingMachine washingMashine;

    @Mock
    private LaundryBatch laundryBatch;
    @Mock
    private ProgramConfiguration programConfiguration;

    @BeforeEach
    void setUp() throws Exception {
        washingMashine = new WashingMachine(dirtDetector, engine, waterPump);
    }

    @Test
    void test() {
        fail("Not yet implemented");
    }

    @Test
    void test01()
    {
        LaundryStatus laundryStatus = washingMashine.start(laundryBatch, programConfiguration);
        assertEquals(ErrorCode.UNKNOWN_ERROR, laundryStatus.getErrorCode());
    }
}
