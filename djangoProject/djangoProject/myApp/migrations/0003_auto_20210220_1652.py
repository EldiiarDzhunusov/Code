# Generated by Django 3.1.6 on 2021-02-20 10:52

import datetime
from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('myApp', '0002_auto_20210220_1652'),
    ]

    operations = [
        migrations.AlterField(
            model_name='action',
            name='create_date',
            field=models.DateTimeField(default=datetime.datetime(2021, 2, 20, 16, 52, 18, 907442)),
        ),
        migrations.AlterField(
            model_name='action',
            name='status',
            field=models.CharField(choices=[('C', 'Completed'), ('N', 'Not Completed'), ('I', 'In Progress')], default='N', max_length=1),
        ),
    ]