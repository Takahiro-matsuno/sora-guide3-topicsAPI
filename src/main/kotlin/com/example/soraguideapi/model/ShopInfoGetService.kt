package com.example.soraguideapi.model

import com.example.soraguideapi.entity.ShopInfoEntity
import com.example.soraguideapi.repository.ShopInfoRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
@Transactional
class ShopInfoGetService (
        private val shopInfoRepository: ShopInfoRepository
) {
    fun findAll(): List<ShopInfoEntity> {
        return shopInfoRepository.findAll()
    }
}