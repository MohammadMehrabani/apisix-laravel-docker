<?php

namespace App\Models;

class Test
{
    protected $value = 0;

    public function increase()
    {
        $this->value++;

        return $this->value;
    }
}
