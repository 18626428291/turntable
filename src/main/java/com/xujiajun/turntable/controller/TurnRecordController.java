package com.xujiajun.turntable.controller;


import com.xujiajun.turntable.common.api.R;
import com.xujiajun.turntable.entity.TurnRecord;
import com.xujiajun.turntable.service.TurnRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author xjiajun
 * @since 2021-04-07
 */
@Api(tags = "选项管理", value = "选项管理")
@RestController
@RequestMapping("/turntable")
@CrossOrigin
public class TurnRecordController {
    @Autowired
    private TurnRecordService recordService;

    @ApiOperation("获取所有选项")
    @GetMapping("/list")
    public R getList() {
        return R.ok().data("list", recordService.list());
    }

    @ApiOperation("添加选项")
    @PostMapping("/create")
    public R create(@RequestBody TurnRecord record) {
        boolean save = recordService.save(record);
        if (!save) {
            return R.error().message("创建失败");
        }
        return R.ok().message("创建成功").data("item", record);
    }

    @ApiOperation("修改选项")
    @PutMapping("/update/{id}")
    public R update(@PathVariable Long id,
                    @RequestBody TurnRecord record) {
        record.setId(id);
        boolean update = recordService.updateById(record);
        if(!update)
            return R.error().message("修改失败");
        return R.ok().message("修改成功").data("item",record);
    }

    @ApiOperation("删除指定选项")
    @DeleteMapping("/delete/{id}")
    public R deleteById(@PathVariable Long id) {
        boolean remove = recordService.removeById(id);
        if(!remove)
            return R.error();
        return R.ok();
    }


}

