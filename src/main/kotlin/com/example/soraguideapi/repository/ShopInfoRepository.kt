package com.example.soraguideapi.repository

import com.example.soraguideapi.entity.ShopInfoEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ShopInfoRepository: JpaRepository<ShopInfoEntity, Long>