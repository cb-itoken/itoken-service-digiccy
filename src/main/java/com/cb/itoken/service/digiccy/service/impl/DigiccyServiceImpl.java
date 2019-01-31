package com.cb.itoken.service.digiccy.service.impl;

import com.cb.itoken.common.domain.TbDigiccyExchange;
import com.cb.itoken.common.mapper.TbDigiccyExchangeMapper;
import com.cb.itoken.common.service.impl.BaseServiceImpl;
import com.cb.itoken.service.digiccy.service.DigiccyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DigiccyServiceImpl extends BaseServiceImpl<TbDigiccyExchange, TbDigiccyExchangeMapper> implements DigiccyService {
}
