/*
 *
 *  * Copyright 2002-2007 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.surenpi.autotest.report.record;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.List;

/**
 * 异常信息记录
 * @author suren
 * @date 2016年9月6日 下午8:36:15
 */
public class ExceptionRecord
{
	private Throwable throwable;
	private NormalRecord normalRecord;
	private List<File> attachFileList;

	public ExceptionRecord(Throwable throwable)
	{
		this.throwable = throwable;
	}

	public ExceptionRecord(Throwable throwable, NormalRecord normalRecord)
	{
		this.throwable = throwable;
		this.normalRecord = normalRecord;
	}

	/**
	 * @return the throwable
	 */
	public Throwable getThrowable()
	{
		return throwable;
	}
	/**
	 * @param throwable the throwable to set
	 */
	public void setThrowable(Throwable throwable)
	{
		this.throwable = throwable;
	}

	/**
	 * @return 异常栈信息
	 */
	public String getStackTraceText()
	{
		if(throwable == null)
		{
			return "";
		}

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		throwable.printStackTrace(new PrintStream(out));
		return out.toString();
	}

	public NormalRecord getNormalRecord()
	{
		return normalRecord;
	}

	public void setNormalRecord(NormalRecord normalRecord)
	{
		this.normalRecord = normalRecord;
	}

	/**
	 * @return the attachFileList
	 */
	public List<File> getAttachFileList()
	{
		return attachFileList;
	}

	/**
	 * @param attachFileList the attachFileList to set
	 */
	public void setAttachFileList(List<File> attachFileList)
	{
		this.attachFileList = attachFileList;
	}
}
