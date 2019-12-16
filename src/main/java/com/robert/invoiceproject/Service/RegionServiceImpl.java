package com.robert.invoiceproject.Service;

import com.robert.invoiceproject.entity.Region;
import com.robert.invoiceproject.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements IRegionService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Region> finsAllRegiones() {
        return clienteRepository.findAllRegiones();
    }
}
