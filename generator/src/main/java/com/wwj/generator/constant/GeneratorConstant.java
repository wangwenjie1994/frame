/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.wwj.generator.constant;

import java.io.File;

/**
 * 生成器常量
 *
 **/
public interface GeneratorConstant {

    /**
     * 用户目录
     */
    String USER_DIR = "user.dir";
    /**
     * java目录 src/main/java
     */
    String JAVA_DIR = File.separator + "src" + File.separator + "main" + File.separator + "java";
    /**
     * resources目录 src/main/resources
     */
    String RESOURCES_DIR = File.separator + "src" + File.separator + "main" + File.separator + "resources";
    /**
     * mapper目录 src/main/resources/mapper
     */
    String MAPPER_DIR = RESOURCES_DIR + File.separator + "mapper";
    /**
     * 参数
     */
    String PARAM = "param";
    /**
     * 分页参数
     */
    String PAGE_PARAM = "PageParam";
    /**
     * VO
     */
    String VO = "VO";
    /**
     * 查询VO
     */
    String QUERY_VO = "QueryVO";
    /**
     * Service
     */
    String SERVICE = "Service";
    /**
     * Mapper
     */
    String MAPPER = "Mapper";
    /**
     * Mapper XML template路径
     */
    String MAPPER_XML_TEMPLATE_PATH = File.separator + "templates" + File.separator + "mapper.xml.vm";
    /**
     * 分页参数 template路径
     */
    String PAGE_PARAM_TEMPLATE_PATH = File.separator + "templates" + File.separator + "pageParam.java.vm";
    /**
     * 查询VO template路径
     */
    String QUERY_VO_TEMPLATE_PATH = File.separator + "templates" + File.separator + "queryVO.java.vm";
    /**
     * 乐观锁属性名称
     */
    String VERSION = "version";
    /**
     * 逻辑删除属性名称
     */
    String DELETED = "deleted";
    /**
     * Service名称
     */
    String SERVICE_NAME = "%sService";
    /**
     * 自定义继承的Entity类全称，带包名
     */
    String SUPER_ENTITY_CLASS = "com.httech.core.entity.BaseEntity";
    /**
     * 自定义继承的Controller类全称，带包名
     */
    String SUPER_CONTROLLER_CLASS = "com.httech.core.controller.BaseController";
    /**
     * 自定义继承的Service类全称，带包名
     */
    String SUPER_SERVICE_CLASS = "com.httech.core.service.BaseService";
    /**
     * 自定义继承的ServiceImpl类全称，带包名
     */
    String SUPER_SERVICE_IMPL_CLASS = "com.httech.core.service.impl.BaseServiceImpl";
    /**
     * 分页参数父类全称，带包名
     */
    String SUPER_PAGE_PARAM_CLASS = "com.httech.core.pagination.BasePageParam";
    /**
     * 分页排序参数父类全称，带包名
     */
    String SUPER_PAGE_ORDER_PARAM_CLASS = "com.httech.core.pagination.BasePageOrderParam";
    /**
     * 公共id参数类全称，带包名
     */
    String ID_PARAM_CLASS = "com.httech.core.param.IdParam";
    /**
     * 分页对象类全称，带包名
     */
    String PAGING_CLASS = "com.httech.core.pagination.Paging";
    /**
     * 分页信息类全称，带包名
     */
    String PAGE_INFO_CLASS = "com.httech.core.pagination.PageInfo";
    /**
     * 公共结果类全称，带包名
     */
    String API_RESULT_CLASS = "com.httech.core.api.ApiResult";

}
