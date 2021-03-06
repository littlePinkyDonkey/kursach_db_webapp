package andrei.teplyh.service;

import andrei.teplyh.dto.PlotProcessDTO;
import andrei.teplyh.dto.ProcessDTO;
import andrei.teplyh.exceptions.ProductNotFoundException;

import java.util.List;

public interface ProcessService {
    List<ProcessDTO> getAllProcesses(int productId) throws ProductNotFoundException;

    int createProcess(ProcessDTO processDTO, int productId) throws ProductNotFoundException;

    int createPloProcess(PlotProcessDTO processDTO, int productId, String login);
}
