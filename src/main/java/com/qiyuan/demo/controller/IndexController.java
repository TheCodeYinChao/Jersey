package com.qiyuan.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Random;

/**
 *
 * @Path 类似 @RequestMapping()
 *
 *
 */
@Path("index")/*@RequestMapping()*/
@Slf4j
@Component
public class IndexController {

    @GET
    @Path("/case")
    @Produces("")
    public String index(){
        log.info("随机数生成：{}",new Random().nextInt());
        return "测试jrebal";

    }

    @GET/*GetMapping*/
    @Path("/query/{id}")
    /**
     * @GET标签：说明该资源方法是使用get方式请求；
     * @Produces标签：代表该资源方法生产的响应MIME格式为application/json；
     * @Consumes标签：代表该资源方法能够接受请求MIME类型为application/json；
     */
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String queryId(@PathParam("id") /*mvc @PathVariable */Long id){
        log.info("接受的参数：{}",id);
        return "测试jrebal";

    }


    @GET/*GetMapping*/
    @Path("/query/{id}")
    /**
     * @GET标签：说明该资源方法是使用get方式请求；
     * @Produces标签：代表该资源方法生产的响应MIME格式为application/json；
     * @Consumes标签：代表该资源方法能够接受请求MIME类型为application/json；
     *
     * 分别设置Accepts为application/xml或者application/json，就可以得到JSON或者XML格式了！
     * ！这点是SpringMVC做不到的，而且更直接的反应出REST的概念！
     */
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public String queryA(@PathParam("id") /*mvc @PathVariable */Long id){
        log.info("接受的参数：{}",id);
        return "测试jrebal";

    }

    /**
     * 1，@GET注解之前已经提到过，表示接受GET类型请求，类似@GetMapping;
     * 2，@POST，表示接受POST类型请求，类似@PostMapping，或者@RequestMapping(method=RequestMethod.POST);
     * 其次注意，在save方法参数列表中出现了@FormParam("name")，代表name参数映射请求的form表单中的name名称的字段值；
     * 关于参数绑定，Jersey还是提供了相当多的注解来映射，后面再介绍。
     * 3，@PUT，表示接受POST类型请求，类似@RequestMapping(method=RequestMethod.PUT);
     * 4，@DELETE，表示接受DELETE类型请求，类似@RequestMapping(method=RequestMethod.DELETE);
     * 5，另外，Jersey还提供了@HEAD，@OPTIONS，看名字对应的就是HEAD和OPTIONS两种请求方式，但是需要注意的一点就是Jersey没有提供针对PATCH 和 TRACE这两种请求方式的对应注解。
     */


}
