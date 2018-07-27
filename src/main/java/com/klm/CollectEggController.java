package com.klm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CollectEggController {


@PostMapping(path="/eggs_collect", produces="application/json")
public @ResponseBody Domain eggs_collect()
{
	Domain dm = new Domain();
	dm.setAction("eggs_collect");
	dm.setMassage("hey look at that look at that 4");
	dm.setData("4");
	return dm;
}

}
