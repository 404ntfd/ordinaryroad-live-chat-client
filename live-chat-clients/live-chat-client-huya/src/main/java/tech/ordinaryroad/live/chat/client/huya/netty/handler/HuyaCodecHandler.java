/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package tech.ordinaryroad.live.chat.client.huya.netty.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import tech.ordinaryroad.live.chat.client.commons.base.exception.BaseException;
import tech.ordinaryroad.live.chat.client.huya.msg.WebSocketCommand;
import tech.ordinaryroad.live.chat.client.huya.msg.base.IHuyaMsg;
import tech.ordinaryroad.live.chat.client.huya.util.HuyaCodecUtil;
import tech.ordinaryroad.live.chat.client.servers.netty.client.handler.BinaryWebSocketFrameToMessageCodec;

import java.util.List;

/**
 * @author mjz
 * @date 2024/3/22
 */
public class HuyaCodecHandler extends BinaryWebSocketFrameToMessageCodec<IHuyaMsg> {
    @Override
    protected void encode(ChannelHandlerContext ctx, IHuyaMsg msg, List<Object> out) throws Exception {
        if (msg instanceof WebSocketCommand) {
            out.add(new BinaryWebSocketFrame(ctx.alloc().buffer().writeBytes(((WebSocketCommand) msg).toByteArray())));
        } else {
            throw new BaseException("暂不支持" + msg.getClass());
        }
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, BinaryWebSocketFrame msg, List<Object> out) throws Exception {
        out.addAll(HuyaCodecUtil.decode(msg.content()));
    }
}

