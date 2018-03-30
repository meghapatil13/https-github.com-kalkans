# -*- coding: utf-8 -*-
# Generated by Django 1.11.11 on 2018-03-30 10:49
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('calamitys', '0002_auto_20180324_0704'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='calamity',
            name='id',
        ),
        migrations.AlterField(
            model_name='calamity',
            name='eid',
            field=models.AutoField(primary_key=True, serialize=False),
        ),
        migrations.AlterField(
            model_name='calamity',
            name='lat',
            field=models.CharField(default=b'', max_length=100),
        ),
        migrations.AlterField(
            model_name='calamity',
            name='lon',
            field=models.CharField(default=b'', max_length=100),
        ),
    ]
